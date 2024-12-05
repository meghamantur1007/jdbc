package com.xworkz.customer.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindBalanceByName {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.xworz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Query query=em.createNamedQuery("findBalanceByName");
		query.setParameter("byName", "Priya Sharma");
		Object object=query.getSingleResult();
		Float balance=(Float)object;
		System.out.println("Phone Number:"+balance);

		try {
			et.begin();
			et.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
			emf.close();
	}
	}

}
