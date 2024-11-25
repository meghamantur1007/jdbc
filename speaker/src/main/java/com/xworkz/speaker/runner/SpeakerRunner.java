package com.xworkz.speaker.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Table;

public class SpeakerRunner {

	public static void main(String[] args) {

		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = eMF.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		if (eMF != null) {
			System.out.println("connected");
		} else {
			System.err.println("not connected");
		}

		/*Speaker_Table speaker1 = new Speaker_Table();
		speaker1.setSpeaker_id(1);
		speaker1.setSpeaker_name("JBL Flip 5");
		speaker1.setBrand("JBL");
		speaker1.setCategory("Bluetooth");
		speaker1.setPrice(100.00);
		speaker1.setStock_quantity(50);
		speaker1.setSupplier_name("JBL Corp");
		speaker1.setSupplier_contact("9876543210");
		speaker1.setDiscount_percentage(15.0);
		speaker1.setIs_active(true);

		Speaker_Table speaker2 = new Speaker_Table();
		speaker2.setSpeaker_id(2);
		speaker2.setSpeaker_name("Sony SRS-XB12");
		speaker2.setBrand("Sony");
		speaker2.setCategory("Bluetooth");
		speaker2.setPrice(80.00);
		speaker2.setStock_quantity(30);
		speaker2.setSupplier_name("Sony Corp");
		speaker2.setSupplier_contact("9876543211");
		speaker2.setDiscount_percentage(10.0);
		speaker2.setIs_active(true);

		Speaker_Table speaker3 = new Speaker_Table();
		speaker3.setSpeaker_id(3);
		speaker3.setSpeaker_name("JBL Flip 5");
		speaker3.setBrand("JBL");
		speaker3.setCategory("Bluetooth");
		speaker3.setPrice(100.00);
		speaker3.setStock_quantity(75);
		speaker3.setSupplier_name("JBL Corp");
		speaker3.setSupplier_contact("1234567892");
		speaker3.setDiscount_percentage(15.0);
		speaker3.setIs_active(true);

		Speaker_Table speaker4 = new Speaker_Table();
		speaker4.setSpeaker_id(4);
		speaker4.setSpeaker_name("Ultimate Ears Boom 3");
		speaker4.setBrand("Ultimate Ears");
		speaker4.setCategory("Bluetooth");
		speaker4.setPrice(150.00);
		speaker4.setStock_quantity(60);
		speaker4.setSupplier_name("Ultimate Ears Corp");
		speaker4.setSupplier_contact("1234567893");
		speaker4.setDiscount_percentage(12.0);
		speaker4.setIs_active(true);*/

		Speaker_Table speaker5 = new Speaker_Table();
		speaker5.setSpeaker_id(5);
		speaker5.setSpeaker_name("Anker Soundcore 2");
		speaker5.setBrand("Anker");
		speaker5.setCategory("Bluetooth");
		speaker5.setPrice(50.00);
		speaker5.setStock_quantity(120);
		speaker5.setSupplier_name("Anker Innovations");
		speaker5.setSupplier_contact("1234567894");
		speaker5.setDiscount_percentage(18.0);
		speaker5.setIs_active(true);

		entityTransaction.begin();
		/*entityManager.persist(speaker1);
		entityManager.persist(speaker2);
		entityManager.persist(speaker3);
		entityManager.persist(speaker4);*/
		entityManager.persist(speaker5);
		entityTransaction.commit();

		System.out.println("values are stored");

		entityManager.close();
		eMF.close();

	}

}
