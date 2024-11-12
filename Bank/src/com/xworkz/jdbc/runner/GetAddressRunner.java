package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.constants.BankConstant;

public class GetAddressRunner {

	public static void main(String[] args) {

		String addressQuery = "select address from bank_table where name='Steven' and phone_number=9876543210";

		try (Connection connection = DriverManager.getConnection(BankConstant.URL.getValue(),
				BankConstant.USER.getValue(), BankConstant.PASSWORD.getValue())) {
			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(addressQuery);
			if (resultSet.next()) {
				String address = resultSet.getString("address");
				System.out.println("Address found " + address);
			} else {
				System.out.println("No record found");
			}

		}

		catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
