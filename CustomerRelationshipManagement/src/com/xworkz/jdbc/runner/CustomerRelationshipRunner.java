package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.jdbc.constant.CustomerRelationshipConstant;
import com.xworkz.jdbc.dto.CustomerRelationshipDto;

public class CustomerRelationshipRunner {

	public static void main(String[] args) {

		CustomerRelationshipDto dto1 = new CustomerRelationshipDto(1, "Aarti Singh", "password123", "123 MG Road",
				"aartisingh@gmail.com", 9876543210L, "Engineer", 30, "Indian", "Loves gadgets");
		CustomerRelationshipDto dto2 = new CustomerRelationshipDto(2, "Priya Sharma", "secure456", "456 Brigade Road",
				"priyasharma@gmail.com", 8765432109L, "Doctor", 35, "Indian", "Health enthusiast");
		CustomerRelationshipDto dto3 = new CustomerRelationshipDto(3, "Sneha Desai", "password789",
				"789 Residency Road", "snehadesai@gmail.com", 7654321098L, "Teacher", 45, "Indian", "Loves reading");
		CustomerRelationshipDto dto4 = new CustomerRelationshipDto(4, "Sonal Mehta", "password123", "101 MG Road",
				"sonalmehta@gmail.com", 6543210987L, "Artist", 32, "Indian", "Art enthusiast");
		CustomerRelationshipDto dto5 = new CustomerRelationshipDto(5, "Anjali Iyer", "mypassword456", "202 Jayanagar",
				"anjaliiyer@gmail.com", 5432109876L, "Chef", 38, "Indian", "Food lover");
		CustomerRelationshipDto dto6 = new CustomerRelationshipDto(6, "Kavya Reddy", "secure789", "303 Koramangala",
				"kavyareddy@gmail.com", 4321098765L, "Lawyer", 33, "Indian", "Travel enthusiast");
		CustomerRelationshipDto dto7 = new CustomerRelationshipDto(7, "Neha Patel", "pass1234", "404 Indiranagar",
				"nehapatel@gmail.com", 3210987654L, "Architect", 29, "Indian", "Nature lover");
		CustomerRelationshipDto dto8 = new CustomerRelationshipDto(8, "Megha Mantur", "securepass456", "Rajajinagar",
				"meghamantur@gmail.com", 2109876543L, "Writer", 30, "Indian", "Book enthusiast");
		CustomerRelationshipDto dto9 = new CustomerRelationshipDto(9, "Riya Verma", "mypassword789", "606 Marathahalli",
				"riyaverma@gmail.com", 1098765432L, "Engineer", 28, "Indian", "Technology fan");
		CustomerRelationshipDto dto10 = new CustomerRelationshipDto(10, "Nisha Gupta", "passwordsecure123",
				"707 HSR Layout", "nishagupta@gmail.com", 9988776655L, "Designer", 31, "Indian", "Fashion lover");

		try (Connection connection = DriverManager.getConnection(CustomerRelationshipConstant.URL.getValue(),
				CustomerRelationshipConstant.USERNAME.getValue(), CustomerRelationshipConstant.PASSWORD.getValue())) {

			PreparedStatement prst = connection
					.prepareStatement("insert into customer values(?,?,?,?,?,?,?,?,?,?)");

			prst.setInt(1, dto1.getCustomer_id());
			prst.setString(2, dto1.getFull_name());
			prst.setString(3, dto1.getPassword());
			prst.setString(4, dto1.getAddress());
			prst.setString(5, dto1.getEmail());
			prst.setLong(6, dto1.getPhone_number());
			prst.setString(7, dto1.getOccupation());
			prst.setInt(8, dto1.getAge());
			prst.setString(9, dto1.getNationality());
			prst.setString(10, dto1.getPreferences());
			prst.addBatch();

			prst.setInt(1, dto2.getCustomer_id());
			prst.setString(2, dto2.getFull_name());
			prst.setString(3, dto2.getPassword());
			prst.setString(4, dto2.getAddress());
			prst.setString(5, dto2.getEmail());
			prst.setLong(6, dto2.getPhone_number());
			prst.setString(7, dto2.getOccupation());
			prst.setInt(8, dto2.getAge());
			prst.setString(9, dto2.getNationality());
			prst.setString(10, dto2.getPreferences());
			prst.addBatch();


			prst.setInt(1, dto3.getCustomer_id());
			prst.setString(2, dto3.getFull_name());
			prst.setString(3, dto3.getPassword());
			prst.setString(4, dto3.getAddress());
			prst.setString(5, dto3.getEmail());
			prst.setLong(6, dto3.getPhone_number());
			prst.setString(7, dto3.getOccupation());
			prst.setInt(8, dto3.getAge());
			prst.setString(9, dto3.getNationality());
			prst.setString(10, dto3.getPreferences());
			prst.addBatch();


			prst.setInt(1, dto4.getCustomer_id());
			prst.setString(2, dto4.getFull_name());
			prst.setString(3, dto4.getPassword());
			prst.setString(4, dto4.getAddress());
			prst.setString(5, dto4.getEmail());
			prst.setLong(6, dto4.getPhone_number());
			prst.setString(7, dto4.getOccupation());
			prst.setInt(8, dto4.getAge());
			prst.setString(9, dto4.getNationality());
			prst.setString(10, dto4.getPreferences());
			prst.addBatch();


			prst.setInt(1, dto5.getCustomer_id());
			prst.setString(2, dto5.getFull_name());
			prst.setString(3, dto5.getPassword());
			prst.setString(4, dto5.getAddress());
			prst.setString(5, dto5.getEmail());
			prst.setLong(6, dto5.getPhone_number());
			prst.setString(7, dto5.getOccupation());
			prst.setInt(8, dto5.getAge());
			prst.setString(9, dto5.getNationality());
			prst.setString(10, dto5.getPreferences());
			prst.addBatch();


			prst.setInt(1, dto6.getCustomer_id());
			prst.setString(2, dto6.getFull_name());
			prst.setString(3, dto6.getPassword());
			prst.setString(4, dto6.getAddress());
			prst.setString(5, dto6.getEmail());
			prst.setLong(6, dto6.getPhone_number());
			prst.setString(7, dto6.getOccupation());
			prst.setInt(8, dto6.getAge());
			prst.setString(9, dto6.getNationality());
			prst.setString(10, dto6.getPreferences());
			prst.addBatch();


			prst.setInt(1, dto7.getCustomer_id());
			prst.setString(2, dto7.getFull_name());
			prst.setString(3, dto7.getPassword());
			prst.setString(4, dto7.getAddress());
			prst.setString(5, dto7.getEmail());
			prst.setLong(6, dto7.getPhone_number());
			prst.setString(7, dto7.getOccupation());
			prst.setInt(8, dto7.getAge());
			prst.setString(9, dto7.getNationality());
			prst.setString(10, dto7.getPreferences());
			prst.addBatch();


			prst.setInt(1, dto8.getCustomer_id());
			prst.setString(2, dto8.getFull_name());
			prst.setString(3, dto8.getPassword());
			prst.setString(4, dto8.getAddress());
			prst.setString(5, dto8.getEmail());
			prst.setLong(6, dto8.getPhone_number());
			prst.setString(7, dto8.getOccupation());
			prst.setInt(8, dto8.getAge());
			prst.setString(9, dto8.getNationality());
			prst.setString(10, dto8.getPreferences());
			prst.addBatch();


			prst.setInt(1, dto9.getCustomer_id());
			prst.setString(2, dto9.getFull_name());
			prst.setString(3, dto9.getPassword());
			prst.setString(4, dto9.getAddress());
			prst.setString(5, dto9.getEmail());
			prst.setLong(6, dto9.getPhone_number());
			prst.setString(7, dto9.getOccupation());
			prst.setInt(8, dto9.getAge());
			prst.setString(9, dto9.getNationality());
			prst.setString(10, dto9.getPreferences());
			prst.addBatch();


			prst.setInt(1, dto10.getCustomer_id());
			prst.setString(2, dto10.getFull_name());
			prst.setString(3, dto10.getPassword());
			prst.setString(4, dto10.getAddress());
			prst.setString(5, dto10.getEmail());
			prst.setLong(6, dto10.getPhone_number());
			prst.setString(7, dto10.getOccupation());
			prst.setInt(8, dto10.getAge());
			prst.setString(9, dto10.getNationality());
			prst.setString(10, dto10.getPreferences());
			prst.addBatch();

            prst.executeBatch();
			
			System.out.println("values are inserted");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}