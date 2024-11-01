package com.xworkz.jdbc.runner;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AirplaneUpdateRunner {

	public static void main(String[] args) {
		String url = "jdbc:mysql://127.0.0.1:3306/airplane";
		String user = "root";
		String password = "Megha@2002";
		String updateQuery="update airplane_table set airplane_name='Bombardier CRJ700',airport_name='Chhatrapati ShivajiMaharaj Airport'where id=10";

		try (Connection connection = DriverManager.getConnection(url, user, password)) {
			Statement statement = connection.createStatement();
			int countValue = statement.executeUpdate(updateQuery);
			if (countValue > 0) {
				System.out.println("values are updated");
			} else {
				System.out.println("values are not updated");

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
