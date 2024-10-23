package com.xworkz.jdbc;

public class Dell {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Dell class");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
