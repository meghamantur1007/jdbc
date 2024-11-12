package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.constants.BankConstant;

public class GetNameRunner {

	public static void main(String[] args) {
		String nameQuery = "select name from bank_table where address='Patna' and email='ritukapoor@gmail.com'";


		try(Connection connection=DriverManager.getConnection(BankConstant.URL.getValue(), BankConstant.USER.getValue(), BankConstant.PASSWORD.getValue())){
			Statement statement=connection.createStatement();
		
			ResultSet resultSet=statement.executeQuery(nameQuery);
			if (resultSet.next()) {
				String userName = resultSet.getString("name");
				System.out.println("Name found: " + userName);
			}else {
				System.out.println("No record found");
			}
		}
			
			catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
