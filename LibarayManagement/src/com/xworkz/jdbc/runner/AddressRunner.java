package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.constant.LibarayManagementConstant;

public class AddressRunner {

	public static void main(String[] args) {

		String addressQuery = "select address from library_members where name='Preeti Patel'and phone_number=8765432109";

		try (Connection connection = DriverManager.getConnection(LibarayManagementConstant.URL.getValue(),
				LibarayManagementConstant.USER.getValue(), LibarayManagementConstant.PASSWORD.getValue())) {
			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(addressQuery);
			if (resultSet.next()) {
				String address = resultSet.getString("address");

				System.out.println("Address found: " + address);
			} else {
				System.out.println("No record found ");
			}
		}

		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
