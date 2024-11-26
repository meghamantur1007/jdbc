package com.xworkz.clinic.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.clinic.dto.DoctorDto;

public class DoctorRunner {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		try {
			
			/*DoctorDto dto=new DoctorDto();
			dto.setId(3);
			dto.setName("Deepa");
			dto.setPhoneNumber(8833567321L);
			dto.setSpecialization("General Physician");
			dto.setAvailableDays(6);*/
			
			DoctorDto doctor = new DoctorDto();
			doctor.setId(4);
			doctor.setName("Divya");
			doctor.setPhoneNumber(8833567321L);
			doctor.setSpecialization("General Physician");
			doctor.setAvailableDays(6);

			entityTransaction.begin();
			//entityManager.persist(dto);
			entityManager.merge(doctor);

			entityTransaction.commit();

			System.out.println("values are updated");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
			entityManagerFactory.close();

		}

	}

}
