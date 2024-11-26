package com.xworkz.clinic.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.clinic.dto.PatientDto;

public class PatientRunner {

	public static void main(String[] args) {

		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("myPersistenceUnit");
		EntityManager entityManager = eMF.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		try {
			/*PatientDto dto=new PatientDto();
			dto.setId(4);
			dto.setName("Kavya Nair");
			dto.setEmail("kavya@gmail.com");
			dto.setPhoneNumber(6543210987L);
			dto.setMembershipType("Regular");*/
			
			//entityManager.persist(dto);
			
			
			PatientDto dto1=new PatientDto();
			dto1.setId(5);
			dto1.setName("Meera Sharma");
			dto1.setEmail("meera@gmail.com");
			dto1.setPhoneNumber(8432109876L);
			dto1.setMembershipType("Regular");
			
					
			entityTransaction.begin();
			//entityManager.persist(dto);
			entityManager.merge(dto1);
			entityTransaction.commit();
			
			
			//System.out.println("values are stored");
			System.out.println("updated");
			

		} catch (

		Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
			eMF.close();

		}
	}

}
