package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.jdbc.constant.CustomerRelationshipConstant;

public class NameByIdRunner {

	public static void main(String[] args) {

		String name = "select full_name from customer where customer_id>5";
		try (Connection connection = DriverManager.getConnection(CustomerRelationshipConstant.URL.getValue(),
				CustomerRelationshipConstant.USERNAME.getValue(), CustomerRelationshipConstant.PASSWORD.getValue())) {

			PreparedStatement prst = connection.prepareStatement(name);
			ResultSet resultSet = prst.executeQuery();
			
			while(resultSet.next()) {
				String names=resultSet.getString("full_name");
				System.out.println(names);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
