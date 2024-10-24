package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BagRunner {

	public static void main(String[] args) {

		String url = "jdbc:mysql://127.0.0.1:3306/bag";
		String user = "root";
		String password = "Megha@2002";
		String query = "insert into bag_table values(20, 'Champion', 1100)";

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, user, password);
			Statement statement = connection.createStatement();
			int value = statement.executeUpdate(query);
			if (value > 0) {
				System.out.println("saved");
			} else {
				System.out.println("not saved");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
