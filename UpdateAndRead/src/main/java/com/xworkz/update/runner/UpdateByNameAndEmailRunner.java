package com.xworkz.update.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateByNameAndEmailRunner {

	public static void main(String[] args) {

		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager em = eMF.createEntityManager();
		EntityTransaction et = em.getTransaction();

		try {
			et.begin();
			int value = em.createQuery(
					"update ProfileDto pd set pd.name =:newName,pd.email =:newEmail WHERE pd.phoneNumber = :phoneNumber")
					.setParameter("newName", "Shalini").
					setParameter("newEmail", "Shalini@gmail.com")
					.setParameter("phoneNumber", 8934526729L).executeUpdate();
			et.commit();
			if (value > 0) {
				System.out.println("values are updated");
			} else {
				System.err.println("not updated");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
			eMF.close();
		}
	}

}
