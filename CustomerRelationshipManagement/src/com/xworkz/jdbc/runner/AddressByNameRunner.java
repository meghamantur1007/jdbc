package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.jdbc.constant.CustomerRelationshipConstant;

public class AddressByNameRunner {

	public static void main(String[] args) {

		String addressQuery = "select address from customer where full_name='Nisha Gupta' and phone_number=9988776655";

		try (Connection connection = DriverManager.getConnection(CustomerRelationshipConstant.URL.getValue(),
				CustomerRelationshipConstant.USERNAME.getValue(), CustomerRelationshipConstant.PASSWORD.getValue())) {

			PreparedStatement prst = connection.prepareStatement(addressQuery);

			ResultSet resultSet = prst.executeQuery();

			if (resultSet.next()) {
				String address = resultSet.getString("address");
				System.out.println("address: " + address);
			} else {
				System.out.println("no record found");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
