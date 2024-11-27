package com.xworkz.gym.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.gym.dto.TrainersDto;

public class TrainersRunner {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		
		List<TrainersDto> trainersList=new ArrayList<TrainersDto>();
		
		trainersList.add(new TrainersDto(1, "Arun", "Sharma", "arun.sharma@gmail.com", 9876543210L, "Fitness Trainer", 5, 40000.0, "Available", "Certified Personal Trainer"));
        trainersList.add(new TrainersDto(2, "Priya", "Mehta", "priya.mehta@gmail.com", 9123456789L, "Yoga Instructor", 7, 45000.0, "Available", "Yoga Alliance Certified"));
        trainersList.add(new TrainersDto(3, "Vikas", "Patil", "vikas.patil@gmail.com", 9865432101L, "Crossfit Coach", 3, 35000.0, "Unavailable", "Crossfit Level 1 Certified"));
        trainersList.add(new TrainersDto(4, "Riya", "Verma", "riya.verma@gmail.com", 9876512345L, "Zumba Trainer", 6, 42000.0, "Available", "Licensed Zumba Instructor"));
        trainersList.add(new TrainersDto(5, "Amit", "Reddy", "amit.reddy@gmail.com", 9123412345L, "Bodybuilding Coach", 8, 50000.0, "Available", "Certified Strength Coach"));
        trainersList.add(new TrainersDto(6, "Sneha", "Desai", "sneha.desai@gmail.com", 9876547890L, "Aerobics Trainer", 4, 38000.0, "Unavailable", "Aerobics Certification"));
        trainersList.add(new TrainersDto(7, "Raj", "Malhotra", "raj.malhotra@gmail.com", 9123498765L, "Strength Trainer", 10, 60000.0, "Available", "Certified Fitness Expert"));
        trainersList.add(new TrainersDto(8, "Nisha", "Kulkarni", "nisha.kulkarni@gmail.com", 9865123478L, "Pilates Trainer", 5, 43000.0, "Available", "Pilates Certified Instructor"));
        trainersList.add(new TrainersDto(9, "Karan", "Singh", "karan.singh@gmail.com", 9123987654L, "Sports Coach", 9, 52000.0, "Unavailable", "Sports Nutrition Certification"));
        trainersList.add(new TrainersDto(10, "Anjali", "Kumar", "anjali.kumar@gmail.com", 9876123450L, "Dietitian", 6, 47000.0, "Available", "Registered Dietitian"));

    	for (TrainersDto dto1 : trainersList) {
			TrainersDto members = new TrainersDto();

			members.setId(dto1.getId());
			members.setFirstName(dto1.getFirstName());
			members.setLastName(dto1.getLastName());
			members.setEmail(dto1.getEmail());
			members.setPhoneNumber(dto1.getPhoneNumber());
			members.setSpecialization(dto1.getSpecialization());
			members.setExperienceYears(dto1.getExperienceYears());
			members.setSalary(dto1.getSalary());
			members.setAvailability(dto1.getAvailability());
			members.setCertifications(dto1.getCertifications());

			entityManager.persist(members);
		}
		try {
			
			entityTransaction.begin();
			
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			entityManager.close();
			entityManagerFactory.close();
		}
	}

}
