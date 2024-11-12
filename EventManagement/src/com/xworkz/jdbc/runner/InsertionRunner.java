package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.constants.EvenetManagementConstant;

public class InsertionRunner {

	public static void main(String[] args) {

		String insertQuery = "insert into attendees values(1, 'Megha Mantur', 'meghamantur@gmail.com', 'Megha@2024', '9876543210', '2024-11-11', '2024-11-11 10:00:00', 500.00, TRUE, 'A1', 22, 'Aisle'),"
				+ "(2, 'Ishita Patel', 'ishitapatel@gmail.com', 'Ishita@2024', '8765432109', '2024-10-25', '2024-10-25 08:30:00', 750.00, TRUE, 'B2', 28, 'Window'),"
				+ "(3, 'Rohan Verma', 'rohanverma@gmail.com', 'Rohan@2024', '7654321098', '2024-09-15', '2024-09-15 09:00:00', 650.00, TRUE, 'C3', 25,'Aisle'),"
				+ "(4, 'Priya Nair', 'priyanair@gmail.com', 'Priya@2024', '8543210987', '2024-08-20', '2024-08-20 07:45:00', 800.00, TRUE, 'D4', 27,'Middle'),"
				+ "(5, 'Vishal Kumar', 'vishalkumar@gmail.com', 'Vishal@2024', '9432109876', '2024-07-12', '2024-07-12 14:00:00', 450.00, TRUE, 'E5', 35, 'Window'),"
				+ "(6, 'Sanya Gupta', 'sanyagupta@gmail.com', 'Sanya@2024', '8721098765', '2024-06-05', '2024-06-05 13:00:00', 900.00, TRUE, 'F6', 32, 'Aisle'),"
				+ "(7, 'Amit Singh', 'amitsingh@gmail.com', 'Amit@2024', '9210987654', '2024-05-21', '2024-05-21 16:30:00', 550.00, TRUE, 'G7', 29, 'Window'),"
				+ "(8, 'Neha Mehta', 'nehamehta@gmail.com', 'Neha@2024', '8109876543', '2024-04-30', '2024-04-30 18:00:00', 700.00, TRUE, 'H8', 26, 'Middle'),"
				+ "(9, 'Kunal Joshi', 'kunaljoshi@gmail.com', 'Kunal@2024', '7098765432', '2024-03-10', '2024-03-10 11:00:00', 600.00, TRUE, 'I9', 31,'Aisle'),"
				+ "(10, 'Shreya Reddy', 'shreyareddy@gmail.com', 'Shreya@2024', '0987654321', '2024-02-17', '2024-02-17 12:30:00', 750.00, TRUE, 'J10', 34,'Window'),"
				+ "(11, 'Ravi Kumar', 'ravikumar@gmail.com', 'Ravi@2024', '9876543211', '2024-01-05', '2024-01-05 08:00:00', 450.00, TRUE, 'K11', 36,'Aisle'),"
				+ "(12, 'Simran Kaur', 'simrankaur@gmail.com', 'Simran@2024', '8765432108', '2023-12-25', '2023-12-25 10:45:00', 800.00, TRUE, 'L12', 29,'Window'),"
				+ "(13, 'Arjun Yadav', 'arjunyadav@gmail.com', 'Arjun@2024', '7654321097', '2023-11-17', '2023-11-17 09:15:00', 650.00, TRUE, 'M13', 30, 'Middle'),"
				+ "(14, 'Maya Verma', 'mayaverma@gmail.com', 'Maya@2024', '6543210986', '2023-10-12', '2023-10-12 14:45:00', 500.00, TRUE, 'N14', 27, 'Aisle'),"
				+ "(15, 'Rohit Shah', 'rohitshah@gmail.com', 'Rohit@2024', '9432109875', '2023-09-22', '2023-09-22 11:30:00', 700.00, TRUE, 'O15', 33,'Window'),"
				+ "(16, 'Anjali Thakur', 'anjalithakur@gmail.com', 'Anjali@2024', '6321098764', '2023-08-14', '2023-08-14 15:00:00', 550.00, TRUE, 'P16', 31,'Aisle'),"
				+ "(17, 'Yash Patil', 'yashpatil@gmail.com', 'Yash@2024', '9210987653', '2023-07-05', '2023-07-05 10:15:00', 480.00, TRUE, 'Q17', 26,'Middle'),"
				+ "(18, 'Aditi Singh', 'aditisingh@gmail.com', 'Aditi@2024', '6109876542', '2023-06-01', '2023-06-01 13:30:00', 620.00, TRUE, 'R18', 28, 'Aisle'),"
				+ "(19, 'Steven Noronha', 'arvindkumar@gmail.com', 'Arvind@2024', '8098765431', '2023-05-10', '2023-05-10 09:45:00', 850.00, TRUE, 'S19', 35, 'Window'),"
				+ "(20, 'Sharika Patil', 'sharikapatil@gmail.com', 'Sharika@2024', '9678787891', '2023-04-10', '2023-04-10 09:25:00', 780.00, TRUE, 'T20', 24,'Middle')";

		try (Connection connection = DriverManager.getConnection(EvenetManagementConstant.URL.getValue(),
				EvenetManagementConstant.USER.getValue(), EvenetManagementConstant.PASSWORD.getValue())) {
			Statement statement = connection.createStatement();
			int value = statement.executeUpdate(insertQuery);
			if (value > 0) {
				System.out.println("values are stored");
			} else {
				System.out.println("values are not stored");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
