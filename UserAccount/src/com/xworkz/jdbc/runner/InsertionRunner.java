package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.constants.UserAccountConstant;

public class InsertionRunner {

	public static void main(String[] args) {

		  String insertQuery = "insert into useraccount_table values(1, 'Aarav Sharma', 'aaravsharma@gmail.com', 'Aarav@2024', 'Delhi', '9876543210', 'aaravsharma', '2024-11-11', '2024-11-11 10:00:00', TRUE, 'M', 'Hindi'),"
	                + "(2, 'Ishita Patel', 'ishitapatel@gmail.com', 'Ishita@2024', 'Mumbai', '8765432109', 'ishitapatel', '2024-10-25', '2024-10-25 08:30:00', TRUE, 'F', 'Gujarati'),"
	                + "(3, 'Rohan Verma', 'rohanverma@gmail.com', 'Rohan@2024', 'Bangalore', '7654321098', 'rohanverma', '2024-09-15', '2024-09-15 09:00:00', TRUE, 'M', 'Kannada'),"
	                + "(4, 'Priya Nair', 'priyanair@gmail.com', 'Priya@2024', 'Chennai', '8543210987', 'priyanair', '2024-08-20', '2024-08-20 07:45:00', TRUE, 'F', 'Tamil'),"
	                + "(5, 'Vishal Kumar', 'vishalkumar@gmail.com', 'Vishal@2024', 'Hyderabad', '9432109876', 'vishalkumar', '2024-07-12', '2024-07-12 14:00:00', TRUE, 'M', 'Telugu'),"
	                + "(6, 'Sanya Gupta', 'sanyagupta@gmail.com', 'Sanya@2024', 'Kolkata', '8721098765', 'sanyagupta', '2024-06-05', '2024-06-05 13:00:00', TRUE, 'F', 'Bengali'),"
	                + "(7, 'Amit Singh', 'amitsingh@gmail.com', 'Amit@2024', 'Jaipur', '9210987654', 'amitsingh', '2024-05-21', '2024-05-21 16:30:00', TRUE, 'M', 'Hindi'),"
	                + "(8, 'Neha Mehta', 'nehamehta@gmail.com', 'Neha@2024', 'Pune', '8109876543', 'nehamehta', '2024-04-30', '2024-04-30 18:00:00', TRUE, 'F', 'Gujarati'),"
	                + "(9, 'Kunal Joshi', 'kunaljoshi@gmail.com', 'Kunal@2024', 'Lucknow', '7098765432', 'kunaljoshi', '2024-03-10', '2024-03-10 11:00:00', TRUE, 'M', 'Hindi'),"
	                + "(10, 'Shreya Reddy', 'shreyareddy@gmail.com', 'Shreya@2024', 'Chennai', '0987654321', 'shreyareddy', '2024-02-17', '2024-02-17 12:30:00', TRUE, 'F', 'Tamil'),"
	                + "(11, 'Ravi Kumar', 'ravikumar@gmail.com', 'Ravi@2024', 'Mumbai', '9876543211', 'ravikumar', '2024-01-05', '2024-01-05 08:00:00', TRUE, 'M', 'Marathi'),"
	                + "(12, 'Simran Kaur', 'simrankaur@gmail.com', 'Simran@2024', 'Amritsar', '8765432108', 'simrankaur', '2023-12-25', '2023-12-25 10:45:00', TRUE, 'F', 'Punjabi'),"
	                + "(13, 'Arjun Yadav', 'arjunyadav@gmail.com', 'Arjun@2024', 'Delhi', '7654321097', 'arjunyadav', '2023-11-17', '2023-11-17 09:15:00', TRUE, 'M', 'Hindi'),"
	                + "(14, 'Maya Verma', 'mayaverma@gmail.com', 'Maya@2024', 'Kolkata', '6543210986', 'mayaverma', '2023-10-12', '2023-10-12 14:45:00', TRUE, 'F', 'Bengali'),"
	                + "(15, 'Rohit Shah', 'rohitshah@gmail.com', 'Rohit@2024', 'Ahmedabad', '9432109875', 'rohitshah', '2023-09-22', '2023-09-22 11:30:00', TRUE, 'M', 'Gujarati'),"
	                + "(16, 'Anjali Thakur', 'anjalithakur@gmail.com', 'Anjali@2024', 'Jaipur', '6321098764', 'anjalithakur', '2023-08-14', '2023-08-14 15:00:00', TRUE, 'F', 'Hindi'),"
	                + "(17, 'Yash Patil', 'yashpatil@gmail.com', 'Yash@2024', 'Pune', '9210987653', 'yashpatil', '2023-07-05', '2023-07-05 10:15:00', TRUE, 'M', 'Marathi'),"
	                + "(18, 'Aditi Singh', 'aditisingh@gmail.com', 'Aditi@2024', 'Lucknow', '6109876542', 'aditisingh', '2023-06-01', '2023-06-01 13:30:00', TRUE, 'F', 'Hindi'),"
	                + "(19, 'Arvind Kumar', 'arvindkumar@gmail.com', 'Arvind@2024', 'Bangalore', '8098765431', 'arvindkumar', '2023-05-10', '2023-05-10 09:45:00', TRUE, 'M', 'Kannada'),"
	                + "(20, 'Sharika Patil', 'sharikapatil@gmail.com', 'Sharika@2024', 'Bangalore', '9678787891', 'sharikapatil', '2023-05-10', '2024-02-10 09:25:00', TRUE, 'F', 'Kannada')";
		try(Connection connection=DriverManager.getConnection(UserAccountConstant.URL.getValue(), UserAccountConstant.USER.getValue(), UserAccountConstant.PASSWORD.getValue())){
			Statement statement=connection.createStatement();
			int result=statement.executeUpdate(insertQuery);
			if(result>0) {
				System.out.println("values are stored");
			}
			else {
				System.out.println("values are not stored");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	}


