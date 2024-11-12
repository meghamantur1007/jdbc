package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.constants.UserAccountConstant;


public class SelectAllRunner {

	public static void main(String[] args) {

		String readQuery = "select * from useraccount_table";

		try (Connection connection = DriverManager.getConnection(UserAccountConstant.URL.getValue(),
				UserAccountConstant.USER.getValue(), UserAccountConstant.PASSWORD.getValue())) {
			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(readQuery);
			while (resultSet.next()) {
				System.out.println("ID: " + resultSet.getInt("id"));
				System.out.println("Name: " + resultSet.getString("name"));
				System.out.println("Email: " + resultSet.getString("email"));
				System.out.println("Password: " + resultSet.getString("password"));
				System.out.println("Address: " + resultSet.getString("address"));
				System.out.println("phone_number: " + resultSet.getString("phone_number"));
				System.out.println("username: " + resultSet.getString("username"));
				System.out.println("registration_date: " + resultSet.getDate("registration_date"));
				System.out.println("last_login: " + resultSet.getTimestamp("last_login"));
				System.out.println("Is Active: " + resultSet.getBoolean("is_active"));
				System.out.println("Gender: " + resultSet.getString("gender"));
				System.out.println("language: " + resultSet.getString("language"));

				System.out.println("-----------------------------");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
