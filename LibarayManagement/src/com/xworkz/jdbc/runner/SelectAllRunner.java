package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.constant.LibarayManagementConstant;

public class SelectAllRunner {

	public static void main(String[] args) {

		String selectAllQuery = "select * from library_members";
		
		try (Connection connection = DriverManager.getConnection(LibarayManagementConstant.URL.getValue(),
				LibarayManagementConstant.USER.getValue(), LibarayManagementConstant.PASSWORD.getValue())) {
			Statement statement = connection.createStatement();
			
			ResultSet resultSet=statement.executeQuery(selectAllQuery);
			while(resultSet.next()) {
				System.out.println("ID: " + resultSet.getInt("id"));
				System.out.println("Name: " + resultSet.getString("name"));
				System.out.println("Address: " + resultSet.getString("address"));
				System.out.println("Password: " + resultSet.getString("password"));
				System.out.println("phone_number: " + resultSet.getLong("phone_number"));
				System.out.println("Email: " + resultSet.getString("email"));
				System.out.println("join_date: " + resultSet.getDate("join_date"));
				System.out.println("membership_type: " + resultSet.getString("membership_type"));
				System.out.println("active: " + resultSet.getBoolean("active"));
				System.out.println("borrowed_books_count: " + resultSet.getInt("borrowed_books_count"));
				System.out.println("last_borrowed_date: " + resultSet.getDate("last_borrowed_date"));
				System.out.println("fine_amount: " + resultSet.getDouble("fine_amount"));
				System.out.println("--------------------------------");
			}

		}

		catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
