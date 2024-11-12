package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.constant.LibarayManagementConstant;

public class NameByIdRunner {

	public static void main(String[] args) {

		String nameQuery = "select* from library_members where id>10";

		try (Connection connection = DriverManager.getConnection(LibarayManagementConstant.URL.getValue(),
				LibarayManagementConstant.USER.getValue(), LibarayManagementConstant.PASSWORD.getValue())) {
			Statement statement = connection.createStatement();

			ResultSet resultset = statement.executeQuery(nameQuery);
			while (resultset.next()) {
				String names = resultset.getString("name");
				System.out.println(names);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
