package com.xworkz.jdbc;

public class Vivo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Vivo class");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
