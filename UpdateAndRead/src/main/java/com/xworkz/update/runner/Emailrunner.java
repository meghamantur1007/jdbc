package com.xworkz.update.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Emailrunner {

	public static void main(String[] args) {
		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager em = eMF.createEntityManager();
		EntityTransaction et = em.getTransaction();

		try {
			et.begin();
			List<String> email = em
					.createQuery("select pd.email from ProfileDto pd where pd.name like:pat1 or pd.name like :pat2",
							String.class)
					.setParameter("pat1", "S%").
					setParameter("pat2", "N%").
					getResultList();

			for (String emails : email) {
			    System.out.println(emails);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
			eMF.close();
		}
	}

}
