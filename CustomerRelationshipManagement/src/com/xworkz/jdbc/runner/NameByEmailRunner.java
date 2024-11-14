package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.jdbc.constant.CustomerRelationshipConstant;

public class NameByEmailRunner {

	public static void main(String[] args) {
		String nameQuery = "select full_name from customer where email='meghamantur@gmail.com' and password='securepass456'";
		try (Connection connection = DriverManager.getConnection(CustomerRelationshipConstant.URL.getValue(),
				CustomerRelationshipConstant.USERNAME.getValue(), CustomerRelationshipConstant.PASSWORD.getValue())) {

			PreparedStatement prst = connection.prepareStatement(nameQuery);
			ResultSet resultset = prst.executeQuery();

			if (resultset.next()) {
				String name = resultset.getString("full_name");
				System.out.println("Name is: " + name);
			} else {
				System.out.println("no record founds");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
