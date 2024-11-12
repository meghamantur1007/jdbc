package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.constants.EvenetManagementConstant;

public class SelectAllRunner {

	public static void main(String[] args) {

		String selectAllQuery = "select * from attendees";

		try (Connection connection = DriverManager.getConnection(EvenetManagementConstant.URL.getValue(),
				EvenetManagementConstant.USER.getValue(), EvenetManagementConstant.PASSWORD.getValue())) {
			Statement statement = connection.createStatement();
			
			ResultSet resultSet=statement.executeQuery(selectAllQuery);
			while(resultSet.next()) {
				System.out.println("ID: " + resultSet.getInt("id"));
				System.out.println("Name: " + resultSet.getString("name"));
				System.out.println("Email: " + resultSet.getString("email"));
				System.out.println("Password: " + resultSet.getString("password"));
				System.out.println("phone_number: " + resultSet.getLong("phone_number"));
				System.out.println("event_date: " + resultSet.getDate("event_date"));
				System.out.println("check_in_time: " + resultSet.getTimestamp("check_in_time"));
				System.out.println("ticket_price: " + resultSet.getDouble("ticket_price"));
				System.out.println("vip_access: " + resultSet.getBoolean("vip_access"));
				System.out.println("seat_number: " + resultSet.getString("seat_number"));
				System.out.println("age: " + resultSet.getInt("age"));
				System.out.println("seat_preference: " + resultSet.getString("seat_preference"));
				System.out.println("--------------------------------");
			}

		}

		catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
