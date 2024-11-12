package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.constants.BankConstant;

public class NameByIdRunner {

	public static void main(String[] args) {

		String name = "select name from bank_table where id>10";

		try (Connection connection = DriverManager.getConnection(BankConstant.URL.getValue(),
				BankConstant.USER.getValue(), BankConstant.PASSWORD.getValue())) {
			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(name);
			while (resultSet.next()) {
				String names = resultSet.getString("name");
				System.out.println(names);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
