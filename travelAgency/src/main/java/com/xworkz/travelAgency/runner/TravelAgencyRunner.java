package com.xworkz.travelAgency.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TravelAgencyRunner {

	public static void main(String[] args) {

		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = eMF.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		if (eMF != null) {
			System.out.println("connected");
		} else {
			System.err.println("not connected");
		}

		Booking_Details travelAgency = new Booking_Details();

		travelAgency.setBooking_id(105);
		travelAgency.setCustomer_name("Ritu G");
		travelAgency.setContact_number("8735426409");
		travelAgency.setEmail("ritu@gmail.com");
		travelAgency.setDestination("Mangalore");
		travelAgency.setTravel_date("2024-12-13");
		travelAgency.setReturn_date("2024-12-19");
		travelAgency.setNumber_of_travelers(1);
		travelAgency.setTotal_cost(1800.00);
		travelAgency.setBooking_status("Confirmed");

		entityTransaction.begin();
		entityManager.persist(travelAgency);
		entityTransaction.commit();

		System.out.println("data is saved into db");
		entityManager.close();
		eMF.close();

	}

}
