package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.constants.EvenetManagementConstant;

public class EmailAndPasswordRunner {

	public static void main(String[] args) {

		String emailQuery = "select email,password from attendees where phone_number=7654321097 and name='Arjun Yadav'";

		try (Connection connection = DriverManager.getConnection(EvenetManagementConstant.URL.getValue(),
				EvenetManagementConstant.USER.getValue(), EvenetManagementConstant.PASSWORD.getValue())) {
			Statement statement = connection.createStatement();

			ResultSet resultset = statement.executeQuery(emailQuery);
			if (resultset.next()) {
				String email = resultset.getString("email");
				String pwd = resultset.getString("password");

				System.out.println("Email:" + email);
				System.out.println("Pssword:" + pwd);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
