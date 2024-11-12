package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.constants.BankConstant;

public class EmailByPhoneAndName {

	public static void main(String[] args) {

		String emailAndNameQuery= "select email,name from bank_table where phone_number=9380916659 and address='Bangalore'";
		
		try (Connection connection = DriverManager.getConnection(BankConstant.URL.getValue(),
				BankConstant.USER.getValue(), BankConstant.PASSWORD.getValue())) {
			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(emailAndNameQuery);
			if (resultSet.next()) {
				String email = resultSet.getString("email");
				String name1 = resultSet.getString("name");
				System.out.println("Email: " + email);
				System.out.println("Name: " + name1);
			} else {
				System.out.println("No record found");
			}

		}

		catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
