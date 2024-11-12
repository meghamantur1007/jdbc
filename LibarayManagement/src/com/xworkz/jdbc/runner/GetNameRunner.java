package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.constant.LibarayManagementConstant;



public class GetNameRunner {

	public static void main(String[] args) {

		  String nameQuery = "select name from library_members where email='meghamantur@gmail.com' and password='Megha@2024'";


			try (Connection connection = DriverManager.getConnection(LibarayManagementConstant.URL.getValue(),
					LibarayManagementConstant.USER.getValue(), LibarayManagementConstant.PASSWORD.getValue())) {
				Statement statement = connection.createStatement();

				ResultSet resultSet = statement.executeQuery(nameQuery);
	            if (resultSet.next()) {
	                String name = resultSet.getString("name");
	                System.out.println("Name found: " + name);
	            } else {
	                System.out.println("No record found ");
	            }
				
				}

			 catch (SQLException e) {
				e.printStackTrace();
			}	}

}
