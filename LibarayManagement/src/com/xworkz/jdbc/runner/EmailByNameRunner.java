package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.constant.LibarayManagementConstant;

public class EmailByNameRunner {

	public static void main(String[] args) {

		String emailQuery = "select email,password from library_members where phone_number=6321098764 and name='Anjali Thakur'";


		try (Connection connection = DriverManager.getConnection(LibarayManagementConstant.URL.getValue(),
				LibarayManagementConstant.USER.getValue(), LibarayManagementConstant.PASSWORD.getValue())) {
			Statement statement = connection.createStatement();

			 ResultSet resultSet = statement.executeQuery(emailQuery);
	            if (resultSet.next()) {
	                String email = resultSet.getString("email");
	                String pwd = resultSet.getString("password");

	                System.out.println("Email found: " + email);
	                System.out.println("Password :"+pwd);
	            } else {
	                System.out.println("No record found ");
	            }
			}

		 catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
