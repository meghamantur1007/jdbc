package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.jdbc.constant.CustomerRelationshipConstant;

public class EmailPasswordRunner {

	public static void main(String[] args) {
		String emailQuery="select email,password from customer where phone_number=9876543210";

		try (Connection connection = DriverManager.getConnection(CustomerRelationshipConstant.URL.getValue(),
				CustomerRelationshipConstant.USERNAME.getValue(), CustomerRelationshipConstant.PASSWORD.getValue())) {
			
			PreparedStatement prst =connection.prepareStatement(emailQuery);
			ResultSet resultSet=prst.executeQuery();
			
			if(resultSet.next()) {
				String email=resultSet.getString("email");
				String pwd=resultSet.getString("password");

				
				System.out.println("Email:"+email);
				System.out.println("Password: "+pwd);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
