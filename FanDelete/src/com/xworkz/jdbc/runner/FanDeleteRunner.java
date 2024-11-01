package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FanDeleteRunner {

	public static void main(String[] args) {
		String url = "jdbc:mysql://127.0.0.1:3306/fan";
		String user = "root";
		String password = "Megha@2002";
		String deleteQuery = "delete from fan_table where id=20";

		try (Connection connection = DriverManager.getConnection(url, user, password)) {
			Statement statement = connection.createStatement();
			int countValue = statement.executeUpdate(deleteQuery);
			if (countValue > 0) {
				System.out.println("values are deleted");
			} else {
				System.out.println("values are not deleted");

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
