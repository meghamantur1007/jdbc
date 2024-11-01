package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AirplaneRunner {

	public static void main(String[] args) {

		String url = "jdbc:mysql://127.0.0.1:3306/airplane";
		String user = "root";
		String password = "Megha@2002";
		String insertquery = "insert into airplane_table  values(1, 'Airbus A320', 'Kempegowda Airport'),"
				+"(2, 'Boeing 737', 'Indira Gandhi International Airport'),"
				+"(3, 'Bombardier CRJ700', 'Chhatrapati ShivajiMaharaj Airport'),"
				+"(4, 'Embraer E175', 'Rajiv Gandhi International Airport'),"
				+"(5, 'Airbus A380', 'Netaji Subhas Chandra Bose International Airport'),"
				+"(6, 'Boeing 747', 'Dubai International Airport'),"
				+"(7, 'Airbus A350', 'Singapore Changi Airport'),"
				+"(8, 'Boeing 787', 'Hartsfield-Jackson Atlanta International Airport'),"
				+"(9, 'McDonnell Douglas MD-80', 'Los Angeles International Airport'),"
				+"(10, 'Boeing 767', 'Heathrow Airport'),"
				+"(11, 'Airbus A220', 'John F. Kennedy International Airport'),"
				+"(12, 'Fokker 100', 'Lufthansa CityLine'),"
				+"(13, 'Airbus A330', 'Toronto Pearson Airport'),"
				+"(14, 'Boeing 777', 'San Francisco International Airport'),"
				+"(15, 'Airbus A310', 'Frankfurt Airport'),"
				+"(16, 'Saab 340', 'Birmingham Airport'),"
				+"(17, 'Embraer E190', 'Madrid-Barajas Airport'),"
				+"(18, 'Bombardier Q400', 'Edinburgh Airport'),"
				+"(19, 'Boeing 717', 'Austin-Bergstrom International Airport'),"
				+"(20, 'Lockheed L-1011', 'Orlando International Airport')";
		

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, user, password);
			Statement statement = connection.createStatement();
			int value = statement.executeUpdate(insertquery);
			if (value > 0) {
				System.out.println("saved");
			} else {
				System.out.println("not saved");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
