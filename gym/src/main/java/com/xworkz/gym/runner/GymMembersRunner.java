package com.xworkz.gym.runner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.gym.dto.GymMembersDto;

public class GymMembersRunner {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		List<GymMembersDto> dto = new ArrayList<GymMembersDto>();
		dto.add(new GymMembersDto(1, "Priya", "Kumar", "priya.kumar@gmail.com", 9876543210L, LocalDate.of(1995, 5, 20),
				"Female", LocalDate.of(2024, 1, 1), "2024-12-31", "Gold"));
		dto.add(new GymMembersDto(2, "Amit", "Sharma", "amit.sharma@gmail.com", 9123456789L, LocalDate.of(1990, 3, 15),
				"Male", LocalDate.of(2024, 2, 1), "2024-11-30", "Silver"));
		dto.add(new GymMembersDto(3, "Sneha", "Patil", "sneha.patil@gmail.com", 9865432101L, LocalDate.of(1993, 7, 10),
				"Female", LocalDate.of(2024, 3, 1), "2024-10-31", "Platinum"));
		dto.add(new GymMembersDto(4, "Raj", "Verma", "raj.verma@gmail.com", 9876512345L, LocalDate.of(1988, 12, 25),
				"Male", LocalDate.of(2024, 4, 1), "2025-03-31", "Gold"));
		dto.add(new GymMembersDto(5, "Anjali", "Reddy", "anjali.reddy@gmail.com", 9123412345L,
				LocalDate.of(1997, 6, 15), "Female", LocalDate.of(2024, 5, 1), "2025-04-30", "Silver"));
		dto.add(new GymMembersDto(6, "Vikram", "Desai", "vikram.desai@gmail.com", 9834567890L, LocalDate.of(1992, 8, 8),
				"Male", LocalDate.of(2024, 6, 1), "2024-12-31", "Gold"));
		dto.add(new GymMembersDto(7, "Pooja", "Naik", "pooja.naik@gmail.com", 9123487654L, LocalDate.of(1996, 4, 20),
				"Female", LocalDate.of(2024, 7, 1), "2024-11-30", "Platinum"));
		dto.add(new GymMembersDto(8, "Karan", "Mehta", "karan.mehta@gmail.com", 9898765432L, LocalDate.of(1991, 11, 5),
				"Male", LocalDate.of(2024, 8, 1), "2025-07-31", "Silver"));
		dto.add(new GymMembersDto(9, "Rhea", "Shah", "rhea.shah@gmail.com", 9812345678L, LocalDate.of(1998, 10, 12),
				"Female", LocalDate.of(2024, 9, 1), "2025-08-31", "Gold"));
		dto.add(new GymMembersDto(10, "Arjun", "Singh", "arjun.singh@gmail.com", 9876541230L, LocalDate.of(1989, 1, 25),
				"Male", LocalDate.of(2024, 10, 1), "2025-09-30", "Platinum"));

		for (GymMembersDto dto1 : dto) {
			GymMembersDto members = new GymMembersDto();

			members.setId(dto1.getId());
			members.setFirstName(dto1.getFirstName());
			members.setLastName(dto1.getLastName());
			members.setEmail(dto1.getEmail());
			members.setPhoneNumber(dto1.getPhoneNumber());
			members.setDateOfBirth(dto1.getDateOfBirth());
			members.setGender(dto1.getGender());
			members.setMembershipStart(dto1.getMembershipStart());
			members.setMembershipEnd(dto1.getMembershipEnd());
			members.setMembershipType(dto1.getMembershipType());

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