package com.xworkz.customer.runner;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class FindNameByPhoneNumber{

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.xworz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Query query=em.createNamedQuery("findNameByPhone");
		query.setParameter("byphone", 9876543210L);
		Object object=query.getSingleResult();
		String name=(String)object;
		System.out.println(name);

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
