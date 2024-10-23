package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CarRunner {

	public static void main(String[] args) {
		String url = "jdbc:mysql://127.0.0.1:3306/carshowroom";
		String userName="root";
		String password="Megha@2002";
		
		
		Connection connection=null;
		
		try {
			connection=DriverManager.getConnection(url,userName,password);
			System.out.println("this is connected");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

