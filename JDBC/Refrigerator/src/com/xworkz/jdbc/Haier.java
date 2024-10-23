package com.xworkz.jdbc;

public class Haier {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Haier class");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
