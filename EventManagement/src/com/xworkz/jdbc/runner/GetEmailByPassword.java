package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.constants.EvenetManagementConstant;

public class GetEmailByPassword {

	public static void main(String[] args) {

		String emailQuery = "select email from attendees where password='Neha@2024' and phone_number=8109876543";

		try (Connection connection = DriverManager.getConnection(EvenetManagementConstant.URL.getValue(),
				EvenetManagementConstant.USER.getValue(), EvenetManagementConstant.PASSWORD.getValue())) {
			Statement statement = connection.createStatement();

			ResultSet resultset = statement.executeQuery(emailQuery);
			if (resultset.next()) {
				String email = resultset.getString("email");
				System.out.println("Email:" + email);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
