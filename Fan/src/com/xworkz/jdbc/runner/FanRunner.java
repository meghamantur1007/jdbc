package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FanRunner {

	public static void main(String[] args) {

		String url="jdbc:mysql://127.0.01:3306/fan";
		String user="root";
		String password="Megha@2002";
		String insertQuery="insert into fan_table values(20, 'Table', 1100)";
		
		Connection connection=null;
		
		try {
			connection=DriverManager.getConnection(url,user,password);
			Statement statement=connection.createStatement();
			int count=statement.executeUpdate(insertQuery);
			if(count>0) {
				
				System.out.println("values are saved");
			}
			else {
				System.out.println("values are not saved");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
