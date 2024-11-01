package com.xworlz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BagDeleteRunner {

	public static void main(String[] args) {

		String url = "jdbc:mysql://127.0.0.1:3306/bag";
		String user = "root";
		String password = "Megha@2002";
		String deleteQuery = "delete from bag_table where id=20";

		try (Connection connection = DriverManager.getConnection(url, user, password)) {
			Statement statement = connection.createStatement();
			int count = statement.executeUpdate(deleteQuery);
			if (count > 0) {
				System.out.println("values are deleted successfully");
			} else {
				System.out.println("values are not deleted successfully");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
