package com.xworkz.customer.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindPhoneNumberByName {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.xworz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Query query=em.createNamedQuery("findPhoneByName");
		query.setParameter("byName", "Riya Verma");
		Object object=query.getSingleResult();
		Long phoneNumnber=(Long)object;
		System.out.println("Phone Number:"+phoneNumnber);

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
