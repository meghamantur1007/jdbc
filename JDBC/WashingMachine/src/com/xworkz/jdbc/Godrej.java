package com.xworkz.jdbc;

public class Godrej {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Godrej class");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
