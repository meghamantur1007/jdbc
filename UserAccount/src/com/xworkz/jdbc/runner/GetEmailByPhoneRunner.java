package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.constants.UserAccountConstant;

public class GetEmailByPhoneRunner {

	public static void main(String[] args) {

        String emailQuery = "select email,password from useraccount_table where phone_number=9678787891";


		try (Connection connection = DriverManager.getConnection(UserAccountConstant.URL.getValue(),
				UserAccountConstant.USER.getValue(), UserAccountConstant.PASSWORD.getValue())) {
			Statement statement = connection.createStatement();

			 ResultSet resultSet = statement.executeQuery(emailQuery);
	            if (resultSet.next()) {
	                String email = resultSet.getString("email");
	                String pwd = resultSet.getString("password");

	                System.out.println("Email found: " + email);
	                System.out.println("Password :"+pwd);
	            } else {
	                System.out.println("No record found ");
	            }
			}

		 catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
