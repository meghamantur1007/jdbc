package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FanUpdateRunner {

	public static void main(String[] args) {
		String url = "jdbc:mysql://127.0.0.1:3306/fan";
		String userName="root";
		String password="Megha@2002";
		String updateQuery="update fan_table set cost=600 where id=10";
		
		try(Connection connection=DriverManager.getConnection(url,userName,password)){
			Statement statement=connection.createStatement();
			int value=statement.executeUpdate(updateQuery);
			if(value>0) {
				System.out.println("values are updated");
			}
			else {
				System.out.println("values are not updated");
			}
			
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}

}
