package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.constants.BankConstant;

public class SelectAllRunner {

	public static void main(String[] args) {

		String selectAllQuery="select * from bank_table";
		
		try(Connection connection=DriverManager.getConnection(BankConstant.URL.getValue(), BankConstant.USER.getValue(), BankConstant.PASSWORD.getValue())){
			Statement statement=connection.createStatement();
		
			ResultSet resultSet=statement.executeQuery(selectAllQuery);
			while(resultSet.next()) {
				System.out.println("ID: " + resultSet.getInt("id"));
				System.out.println("Name: " + resultSet.getString("name"));
				System.out.println("Email: " + resultSet.getString("email"));
				System.out.println("Address: " + resultSet.getString("address"));
				System.out.println("Phone Number: " + resultSet.getLong("phone_number"));
				System.out.println("Account Name: " + resultSet.getString("account_name"));
				System.out.println("Bank Name: " + resultSet.getString("bank_name"));
				System.out.println("Account Balance: " + resultSet.getBigDecimal("account_balance"));
				System.out.println("Account Number: " + resultSet.getLong("account_number"));
				System.out.println("Is Active: " + resultSet.getBoolean("is_active"));
				System.out.println("Type of Account: " + resultSet.getString("type_of_account"));
				System.out.println("Gender: " + resultSet.getString("gender"));
				System.out.println("-----------------------------");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
