package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.constants.UserAccountConstant;

public class GetAddressRunner {

	public static void main(String[] args) {

        String addressQuery = "select address from useraccount_table where name='Ishita Patel' and phone_number=8765432109";


		try (Connection connection = DriverManager.getConnection(UserAccountConstant.URL.getValue(),
				UserAccountConstant.USER.getValue(), UserAccountConstant.PASSWORD.getValue())) {
			Statement statement = connection.createStatement();

			  ResultSet resultSet = statement.executeQuery(addressQuery);
	            if (resultSet.next()) {
	                String address1 = resultSet.getString("address");
	                System.out.println("Address found: " + address1);
	            } else {
	                System.out.println("No record found ");
	            }
			}

		 catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
