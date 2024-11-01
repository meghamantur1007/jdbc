package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BagUpdateRunner {

	public static void main(String[] args) {
		String url = "jdbc:mysql://127.0.0.1:3306/bag";
		String user = "root";
		String password = "Megha@2002";
		String updateQuery = "UPDATE bag_table SET brand='VIP' WHERE id=10";

		try (Connection connection = DriverManager.getConnection(url, user, password)) {
			Statement statement = connection.createStatement();
			int value = statement.executeUpdate(updateQuery);

			if (value > 0) {
				System.out.println("Values are updated successfully");
			} else {
				System.out.println("Values are not updated successfully");

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
