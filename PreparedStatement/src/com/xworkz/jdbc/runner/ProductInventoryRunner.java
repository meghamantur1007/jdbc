package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.jdbc.constant.ProductConstant;

public class ProductInventoryRunner {

	public static void main(String[] args) {

		try (Connection connection = DriverManager.getConnection(ProductConstant.URL.getValue(),
				ProductConstant.USER.getValue(), ProductConstant.PASSWORD.getValue())) {

			PreparedStatement preparedStatement = connection
					.prepareStatement("insert into product_table values(?,?,?,?,?)");

			preparedStatement.setInt(1, 1);
			preparedStatement.setString(2, "Laptop");
			preparedStatement.setString(3, "Electronics");
			preparedStatement.setBigDecimal(4, new java.math.BigDecimal("899.99"));
			preparedStatement.setInt(5, 50);
			preparedStatement.executeUpdate();

			preparedStatement.setInt(1, 2);
			preparedStatement.setString(2, "Smartphone");
			preparedStatement.setString(3, "Electronics");
			preparedStatement.setBigDecimal(4, new java.math.BigDecimal("499.99"));
			preparedStatement.setInt(5, 150);
			preparedStatement.executeUpdate();

			preparedStatement.setInt(1, 3);
			preparedStatement.setString(2, "Washing Machine");
			preparedStatement.setString(3, "Home Appliances");
			preparedStatement.setBigDecimal(4, new java.math.BigDecimal("299.99"));
			preparedStatement.setInt(5, 30);
			preparedStatement.executeUpdate();

			preparedStatement.setInt(1, 4);
			preparedStatement.setString(2, "Refrigerator");
			preparedStatement.setString(3, "Home Appliances");
			preparedStatement.setBigDecimal(4, new java.math.BigDecimal("599.99"));
			preparedStatement.setInt(5, 25);
			preparedStatement.executeUpdate();

			preparedStatement.setInt(1, 5);
			preparedStatement.setString(2, "Microwave");
			preparedStatement.setString(3, "Home Appliances");
			preparedStatement.setBigDecimal(4, new java.math.BigDecimal("199.99"));
			preparedStatement.setInt(5, 80);
			preparedStatement.executeUpdate();

			preparedStatement.setInt(1, 6);
			preparedStatement.setString(2, "Air Conditioner");
			preparedStatement.setString(3, "Home Appliances");
			preparedStatement.setBigDecimal(4, new java.math.BigDecimal("799.99"));
			preparedStatement.setInt(5, 40);
			preparedStatement.executeUpdate();

			preparedStatement.setInt(1, 7);
			preparedStatement.setString(2, "Television");
			preparedStatement.setString(3, "Electronics");
			preparedStatement.setBigDecimal(4, new java.math.BigDecimal("499.99"));
			preparedStatement.setInt(5, 60);
			preparedStatement.executeUpdate();

			preparedStatement.setInt(1, 8);
			preparedStatement.setString(2, "Blender");
			preparedStatement.setString(3, "Home Appliances");
			preparedStatement.setBigDecimal(4, new java.math.BigDecimal("89.99"));
			preparedStatement.setInt(5, 100);
			preparedStatement.executeUpdate();

			preparedStatement.setInt(1, 9);
			preparedStatement.setString(2, "Electric Kettle");
			preparedStatement.setString(3, "Home Appliances");
			preparedStatement.setBigDecimal(4, new java.math.BigDecimal("29.99"));
			preparedStatement.setInt(5, 120);
			preparedStatement.executeUpdate();

			preparedStatement.setInt(1, 10);
			preparedStatement.setString(2, "Coffee Maker");
			preparedStatement.setString(3, "Home Appliances");
			preparedStatement.setBigDecimal(4, new java.math.BigDecimal("69.99"));
			preparedStatement.setInt(5, 90);
			preparedStatement.executeUpdate();

			preparedStatement.setInt(1, 11);
			preparedStatement.setString(2, "Smartwatch");
			preparedStatement.setString(3, "Electronics");
			preparedStatement.setBigDecimal(4, new java.math.BigDecimal("199.99"));
			preparedStatement.setInt(5, 200);
			preparedStatement.executeUpdate();

			preparedStatement.setInt(1, 12);
			preparedStatement.setString(2, "Tablet");
			preparedStatement.setString(3, "Electronics");
			preparedStatement.setBigDecimal(4, new java.math.BigDecimal("299.99"));
			preparedStatement.setInt(5, 150);
			preparedStatement.executeUpdate();

			preparedStatement.setInt(1, 13);
			preparedStatement.setString(2, "Headphones");
			preparedStatement.setString(3, "Electronics");
			preparedStatement.setBigDecimal(4, new java.math.BigDecimal("89.99"));
			preparedStatement.setInt(5, 250);
			preparedStatement.executeUpdate();

			preparedStatement.setInt(1, 14);
			preparedStatement.setString(2, "Printer");
			preparedStatement.setString(3, "Electronics");
			preparedStatement.setBigDecimal(4, new java.math.BigDecimal("149.99"));
			preparedStatement.setInt(5, 70);
			preparedStatement.executeUpdate();

			preparedStatement.setInt(1, 15);
			preparedStatement.setString(2, "Desk Fan");
			preparedStatement.setString(3, "Home Appliances");
			preparedStatement.setBigDecimal(4, new java.math.BigDecimal("39.99"));
			preparedStatement.setInt(5, 110);
			preparedStatement.executeUpdate();

			System.out.println("values are inserted successfully");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
