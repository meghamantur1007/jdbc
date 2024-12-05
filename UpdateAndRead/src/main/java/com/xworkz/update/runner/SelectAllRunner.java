package com.xworkz.update.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.update.dto.ProfileDto;

public class SelectAllRunner {

	public static void main(String[] args) {


		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager em = eMF.createEntityManager();
		EntityTransaction et = em.getTransaction();

		try {
			et.begin();
            List<ProfileDto> profiles = em.createQuery("select pd from ProfileDto pd", ProfileDto.class).getResultList();

            System.out.println(profiles);
			et.commit();
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
			eMF.close();
		}
	}

}
