package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.constants.EvenetManagementConstant;

public class GetNameByEmailRunner {

	public static void main(String[] args) {

		String name="select name from attendees where email='meghamantur@gmail.com' and password='Megha@2024'";
		
		try(Connection connection=DriverManager.getConnection(EvenetManagementConstant.URL.getValue(),EvenetManagementConstant.USER.getValue(),EvenetManagementConstant.PASSWORD.getValue())){
			Statement statement =connection.createStatement();
			
			ResultSet resultset=statement.executeQuery(name);
			if(resultset.next()) {
				String name1=resultset.getString("name");
				System.out.println("Name:"+name1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
