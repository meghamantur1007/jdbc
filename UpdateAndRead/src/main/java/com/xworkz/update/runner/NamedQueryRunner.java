package com.xworkz.update.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.update.dto.ProfileDto;

public class NamedQueryRunner {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction et = entityManager.getTransaction();

	
		  Query[] query=new Query[10];
		  query[0]=entityManager.createNamedQuery("findByName");
		  query[1]=entityManager.createNamedQuery("findByEmail");
		  query[2]=entityManager.createNamedQuery("findByAge");
		  query[3]=entityManager.createNamedQuery("findByAddress");
		  query[4]=entityManager.createNamedQuery("findByNameAndPhone");
		  query[5]=entityManager.createNamedQuery("findByNameAndEmail");
		  query[6]=entityManager.createNamedQuery("findByPhoneAndAge");
		  query[7]=entityManager.createNamedQuery("findById");		  
		  query[8]=entityManager.createNamedQuery("findByPhoneNumber");
		  query[9]= entityManager.createNamedQuery("findByNameAndAddress");

		for(Query queries:query)
		{
			Object obj = queries.getSingleResult();
			ProfileDto dto = (ProfileDto) obj;
			System.out.println(dto.toString());
		} 
		try {
			et.begin();
			et.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			emf.close();
			entityManager.close();
		}
	}

}
