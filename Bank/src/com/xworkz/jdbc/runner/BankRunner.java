package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BankRunner {

	public static void main(String[] args) {

		String url = "jdbc:mysql://127.0.0.1:3306/bank_account";
		String user = "root";
		String password = "Megha@2002";
		String insertQuery = "insert into bank_table values(1,'Megha','meghamantur@gmail.com','Bangalore',9380916659,'Megha','SBI',50000,1122334455,true,'Savings Account','F'),"
				+ "(2, 'Steven', 'stevennoronha@gmail.com', 'Mumbai', 9876543210, 'Steven', 'HDFC', 75000, 2233445566, true, 'Current Account', 'M'),"
				+ "(3, 'Priya', 'priyaverma@gmail.com', 'Chennai', 8765432109, 'Priya', 'ICICI', 62000, 3344556677, true, 'Savings Account', 'F'),"
				+ "(4, 'Amit', 'amitsingh@gmail.com', 'Delhi', 7654321098, 'Amit', 'Axis Bank', 90000, 4455667788, true, 'Fixed Deposit', 'M'),"
				+ "(5, 'Sneha', 'snehamishra@gmail.com', 'Kolkata', 6543210987, 'Sneha', 'PNB', 45000, 5566778899, true, 'Savings Account', 'F'),"
				+ "(6, 'Arjun', 'arjunkumar@gmail.com', 'Pune', 5432109876, 'Arjun', 'Bank of Baroda', 58000, 6677889900, true, 'Current Account', 'M'),"
				+ "(7, 'Lakshmi', 'lakshminair@gmail.com', 'Hyderabad', 4321098765, 'Lakshmi', 'Canara Bank', 30000, 7788990011, true, 'Recurring Deposit', 'F'),"
				+ "(8, 'Rohit', 'rohitpatel@gmail.com', 'Ahmedabad', 3210987654, 'Rohit', 'Union Bank', 55000, 8899001122, true, 'Business Account', 'M'),"
				+ "(9, 'Anjali', 'anjalidas@gmail.com', 'Bangalore', 2109876543, 'Anjali', 'IDFC First', 47000, 9900112233, true, 'Savings Account', 'F'),"
				+ "(10, 'Vikram', 'vikramrao@gmail.com', 'Jaipur', 1098765432, 'Vikram', 'Yes Bank', 38000, 1001100110, true, 'Current Account', 'M'),"
				+ "(11, 'Neha', 'nehasharma@gmail.com', 'Lucknow', 9087654321, 'Neha', 'Kotak Mahindra', 70000, 1102200334, true, 'Savings Account', 'F'),"
				+ "(12, 'Pankaj', 'pankajtiwari@gmail.com', 'Nagpur', 8976543210, 'Pankaj', 'RBL Bank', 64000, 2203301445, true, 'Salary Account', 'M'),"
				+ "(13, 'Pooja', 'poojayadav@gmail.com', 'Indore', 7865432109, 'Pooja', 'Bank of India', 71000, 3304402556, true, 'Current Account', 'F'),"
				+ "(14, 'Sandeep', 'sandeepjain@gmail.com', 'Surat', 6754321098, 'Sandeep', 'Federal Bank', 81000, 4405503667, true, 'Savings Account', 'M'),"
				+ "(15, 'Ritu', 'ritukapoor@gmail.com', 'Patna', 5643210987, 'Ritu', 'South Indian Bank', 52000, 5506604778, true, 'Fixed Deposit', 'F'),"
				+ "(16, 'Akash', 'akashmehta@gmail.com', 'Kanpur', 4532109876, 'Akash', 'Standard Chartered', 60000, 6607705889, true, 'Savings Account', 'M'),"
				+ "(17, 'Meera', 'meerarao@gmail.com', 'Coimbatore', 3421098765, 'Meera', 'DBS Bank', 58000, 7708806990, true, 'Business Account', 'F'),"
				+ "(18, 'Raghu', 'raghur@gmail.com', 'Mysore', 2310987654, 'Raghu', 'Karnataka Bank', 49000, 8809907001, true, 'Savings Account', 'M'),"
				+ "(19, 'Swati', 'swatiagrawal@gmail.com', 'Guwahati', 1209876543, 'Swati', 'Bank of Maharashtra', 45000, 9901100112, true, 'NRI Account', 'F'),"
				+ "(20, 'Srushti', 'srushtipatil@gmail.com', 'Ranchi', 1098765432, 'Srushti', 'Indian Overseas Bank', 55000, 1012202334, true, 'Joint Account', 'F')";

		String readQuery = "select * from bank_table";
		String nameQuery = "select name from bank_table where address='Patna' and email='ritukapoor@gmail.com'";
		String addressQuery = "select address from bank_table where name='Steven' and phone_number=9876543210";
		String emailAndNameQuery = "select email,name from bank_table where phone_number=9087654321";
		String emailAndNameQuery1 = "select email,name from bank_table where phone_number=9380916659 and address='Bangalore'";
		String queryQuery1 = "select name from bank_table where id>10";

		try (Connection connection = DriverManager.getConnection(url, user, password)) {
			Statement statement = connection.createStatement();

			int insertResult = statement.executeUpdate(insertQuery);
			if (insertResult > 0) {
				System.out.println("Values are stored successfully.");
			} else {
				System.out.println("Values were not stored.");
			}
			

			ResultSet resultSet = statement.executeQuery(readQuery);
			while (resultSet.next()) {
				System.out.println("ID: " + resultSet.getInt("id"));
				System.out.println("Name: " + resultSet.getString("name"));
				System.out.println("Email: " + resultSet.getString("email"));
				System.out.println("Address: " + resultSet.getString("address"));
				System.out.println("Phone Number: " + resultSet.getLong("phone_number"));
				System.out.println("Account Name: " + resultSet.getString("account_name"));
				System.out.println("Bank Name: " + resultSet.getString("bank_name"));
				System.out.println("Account Balance: " + resultSet.getBigDecimal("account_balance"));
				System.out.println("Account Number: " + resultSet.getLong("account_number"));
				System.out.println("Is Active: " + resultSet.getBoolean("is_active"));
				System.out.println("Type of Account: " + resultSet.getString("type_of_account"));
				System.out.println("Gender: " + resultSet.getString("gender"));
				System.out.println("-----------------------------");
			}
            Statement statement1 = connection.createStatement();
			ResultSet resultSet1 = statement1.executeQuery(nameQuery);
			if (resultSet1.next()) {
				String userName = resultSet1.getString("name");
				System.out.println("Name found: " + userName);
			}else {
				System.out.println("No record found with the specified id and email.");
			}

            Statement statement2 = connection.createStatement();
			ResultSet resultSet2 = statement2.executeQuery(addressQuery);
			if (resultSet2.next()) {
				String address = resultSet2.getString("address");
				System.out.println("Address found " + address);
			} else {
				System.out.println("No record found");
			}
			System.out.println("------------------");

            Statement statement3 = connection.createStatement();
			ResultSet resultSet3 = statement3.executeQuery(emailAndNameQuery);
			if (resultSet3.next()) {
				String email = resultSet3.getString("email");
				String name1 = resultSet3.getString("name");
				System.out.println("Email: " + email);
				System.out.println("Name: " + name1);
			} else {
				System.out.println("No record found with the specified id.");
			}
			System.out.println("-------------------------");
			
            Statement statement4 = connection.createStatement();
			ResultSet resultSet4 = statement4.executeQuery(emailAndNameQuery1);
			if (resultSet4.next()) {
				String email = resultSet4.getString("email");
				String name2 = resultSet4.getString("name");
				System.out.println("Email: " + email);
				System.out.println("Name: " + name2);
			} else {
				System.out.println("No record found");
			}

			System.out.println("-------------------------");
            Statement statement5 = connection.createStatement();
			ResultSet resultSet5 = statement5.executeQuery(queryQuery1);
			while (resultSet5.next()) {
				String name5 = resultSet5.getString("name");
				System.out.println("Name:" + name5);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
