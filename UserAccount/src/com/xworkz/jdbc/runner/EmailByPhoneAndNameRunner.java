package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.constants.UserAccountConstant;

public class EmailByPhoneAndNameRunner {

	public static void main(String[] args) {

        String emailAndPwdQuery = "select email,password from useraccount_table where phone_number=7654321097 and name='Arjun Yadav'";

        try (Connection connection = DriverManager.getConnection(UserAccountConstant.URL.getValue(),
        		UserAccountConstant.USER.getValue(), UserAccountConstant.PASSWORD.getValue())) {
			Statement statement = connection.createStatement();

			 ResultSet resultSet = statement.executeQuery(emailAndPwdQuery);
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
