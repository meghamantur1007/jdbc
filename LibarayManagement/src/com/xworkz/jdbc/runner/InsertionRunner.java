package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.constant.LibarayManagementConstant;

public class InsertionRunner {

	public static void main(String[] args) {

		String insertQuery = "insert into library_members values(1, 'Megha Mantur', 'Delhi', 'Megha@2024', '9876543210', 'meghamantur@gmail.com', '2024-11-11', 'Premium', TRUE, 5, '2024-11-10 10:00:00', 0.00),"
		        + "(2, 'Preeti Patel', 'Mumbai', 'Preeti@2024', '8765432109', 'preetipatel@gmail.com', '2024-10-25', 'Basic', TRUE, 3, '2024-10-20 08:30:00', 20.50),"
		        + "(3, 'Rohan Verma', 'Bangalore', 'Rohan@2024', '7654321098', 'rohanverma@gmail.com', '2024-09-15', 'Premium', TRUE, 4, '2024-09-12 09:00:00', 0.00),"
		        + "(4, 'Priya Nair', 'Chennai', 'Priya@2024', '8543210987', 'priyanair@gmail.com', '2024-08-20', 'Basic', TRUE, 2, '2024-08-18 07:45:00', 15.00),"
		        + "(5, 'Vishal Kumar', 'Hyderabad', 'Vishal@2024', '9432109876', 'vishalkumar@gmail.com', '2024-07-12', 'Standard', TRUE, 6, '2024-07-10 14:00:00', 30.75),"
		        + "(6, 'Sanya Gupta', 'Kolkata', 'Sanya@2024', '8721098765', 'sanyagupta@gmail.com', '2024-06-05', 'Premium', TRUE, 3, '2024-06-02 13:00:00', 0.00),"
		        + "(7, 'Amit Singh', 'Jaipur', 'Amit@2024', '9210987654', 'amitsingh@gmail.com', '2024-05-21', 'Basic', TRUE, 1, '2024-05-18 16:30:00', 5.00),"
		        + "(8, 'Neha Mehta', 'Pune', 'Neha@2024', '8109876543', 'nehamehta@gmail.com', '2024-04-30', 'Standard', TRUE, 2, '2024-04-25 18:00:00', 10.00),"
		        + "(9, 'Kunal Joshi', 'Lucknow', 'Kunal@2024', '7098765432', 'kunaljoshi@gmail.com', '2024-03-10', 'Basic', TRUE, 4, '2024-03-05 11:00:00', 0.00),"
		        + "(10, 'Shreya Reddy', 'Chennai', 'Shreya@2024', '0987654321', 'shreyareddy@gmail.com', '2024-02-17', 'Premium', TRUE, 5, '2024-02-14 12:30:00', 0.00),"
		        + "(11, 'Ravi Kumar', 'Mumbai', 'Ravi@2024', '9876543211', 'ravikumar@gmail.com', '2024-01-05', 'Standard', TRUE, 3, '2024-01-03 08:00:00', 20.00),"
		        + "(12, 'Simran Kaur', 'Amritsar', 'Simran@2024', '8765432108', 'simrankaur@gmail.com', '2023-12-25', 'Basic', TRUE, 2, '2023-12-22 10:45:00', 5.00),"
		        + "(13, 'Arjun Yadav', 'Delhi', 'Arjun@2024', '7654321097', 'arjunyadav@gmail.com', '2023-11-17', 'Premium', TRUE, 4, '2023-11-15 09:15:00', 0.00),"
		        + "(14, 'Maya Verma', 'Kolkata', 'Maya@2024', '6543210986', 'mayaverma@gmail.com', '2023-10-12', 'Standard', TRUE, 3, '2023-10-10 14:45:00', 15.00),"
		        + "(15, 'Rohit Shah', 'Ahmedabad', 'Rohit@2024', '9432109875', 'rohitshah@gmail.com', '2023-09-22', 'Basic', TRUE, 2, '2023-09-20 11:30:00', 10.00),"
		        + "(16, 'Anjali Thakur', 'Jaipur', 'Anjali@2024', '6321098764', 'anjalithakur@gmail.com', '2023-08-14', 'Premium', TRUE, 3, '2023-08-12 15:00:00', 0.00),"
		        + "(17, 'Yash Patil', 'Pune', 'Yash@2024', '9210987653', 'yashpatil@gmail.com', '2023-07-05', 'Basic', TRUE, 2, '2023-07-03 10:15:00', 5.00),"
		        + "(18, 'Aditi Singh', 'Lucknow', 'Aditi@2024', '6109876542', 'aditisingh@gmail.com', '2023-06-01', 'Standard', TRUE, 4, '2023-05-30 13:30:00', 0.00),"
		        + "(19, 'Arvind Kumar', 'Bangalore', 'Arvind@2024', '8098765431', 'arvindkumar@gmail.com', '2023-05-10', 'Premium', TRUE, 5, '2023-05-08 09:45:00', 0.00),"
		        + "(20, 'Deepa Patil', 'Bangalore', 'Deepa@2024', '9678787891', 'deepapatil@gmail.com', '2023-05-10', 'Basic', TRUE, 3, '2023-05-08 09:25:00', 5.00);";

		try(Connection connection=DriverManager.getConnection(LibarayManagementConstant.URL.getValue(), LibarayManagementConstant.USER.getValue(), LibarayManagementConstant.PASSWORD.getValue())){
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
