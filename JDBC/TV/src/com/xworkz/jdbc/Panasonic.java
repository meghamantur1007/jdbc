package com.xworkz.jdbc;

public class Panasonic {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Panasonic class");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
