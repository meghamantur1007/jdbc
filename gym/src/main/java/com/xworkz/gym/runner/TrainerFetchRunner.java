package com.xworkz.gym.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.gym.dto.TrainersDto;

public class TrainerFetchRunner {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		List<Integer> id = new ArrayList<Integer>();
		id.add(1);
		id.add(2);
		id.add(3);
		id.add(4);
		id.add(5);
		id.add(6);
		id.add(7);
		id.add(8);
		id.add(9);
		id.add(10);

		for (int ids : id) {
			TrainersDto dto = entityManager.find(TrainersDto.class, ids);
			System.out.println("dto===" + dto);
		}
		try {

			entityTransaction.begin();

			entityTransaction.commit();
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
		finally {
			entityManager.close();
			entityManagerFactory.close();
		}
	}

}
