package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountRunner {

    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/user_account";
        String user = "root";
        String password = "Megha@2002";
        
        String insertQuery = "insert into useraccount_table values(1, 'Aarav Sharma', 'aaravsharma@example.com', 'Aarav@2024', 'Delhi', '9876543210', 'aaravsharma', '2024-11-11', '2024-11-11 10:00:00', TRUE, 'M', 'Hindi'),"
                + "(2, 'Ishita Patel', 'ishitapatel@example.com', 'Ishita@2024', 'Mumbai', '8765432109', 'ishitapatel', '2024-10-25', '2024-10-25 08:30:00', TRUE, 'F', 'Gujarati'),"
                + "(3, 'Rohan Verma', 'rohanverma@example.com', 'Rohan@2024', 'Bangalore', '7654321098', 'rohanverma', '2024-09-15', '2024-09-15 09:00:00', TRUE, 'M', 'Kannada'),"
                + "(4, 'Priya Nair', 'priyanair@example.com', 'Priya@2024', 'Chennai', '8543210987', 'priyanair', '2024-08-20', '2024-08-20 07:45:00', TRUE, 'F', 'Tamil'),"
                + "(5, 'Vishal Kumar', 'vishalkumar@example.com', 'Vishal@2024', 'Hyderabad', '9432109876', 'vishalkumar', '2024-07-12', '2024-07-12 14:00:00', TRUE, 'M', 'Telugu'),"
                + "(6, 'Sanya Gupta', 'sanyagupta@example.com', 'Sanya@2024', 'Kolkata', '8721098765', 'sanyagupta', '2024-06-05', '2024-06-05 13:00:00', TRUE, 'F', 'Bengali'),"
                + "(7, 'Amit Singh', 'amitsingh@example.com', 'Amit@2024', 'Jaipur', '9210987654', 'amitsingh', '2024-05-21', '2024-05-21 16:30:00', TRUE, 'M', 'Hindi'),"
                + "(8, 'Neha Mehta', 'nehamehta@example.com', 'Neha@2024', 'Pune', '8109876543', 'nehamehta', '2024-04-30', '2024-04-30 18:00:00', TRUE, 'F', 'Gujarati'),"
                + "(9, 'Kunal Joshi', 'kunaljoshi@example.com', 'Kunal@2024', 'Lucknow', '7098765432', 'kunaljoshi', '2024-03-10', '2024-03-10 11:00:00', TRUE, 'M', 'Hindi'),"
                + "(10, 'Shreya Reddy', 'shreyareddy@example.com', 'Shreya@2024', 'Chennai', '0987654321', 'shreyareddy', '2024-02-17', '2024-02-17 12:30:00', TRUE, 'F', 'Tamil'),"
                + "(11, 'Ravi Kumar', 'ravikumar@example.com', 'Ravi@2024', 'Mumbai', '9876543211', 'ravikumar', '2024-01-05', '2024-01-05 08:00:00', TRUE, 'M', 'Marathi'),"
                + "(12, 'Simran Kaur', 'simrankaur@example.com', 'Simran@2024', 'Amritsar', '8765432108', 'simrankaur', '2023-12-25', '2023-12-25 10:45:00', TRUE, 'F', 'Punjabi'),"
                + "(13, 'Arjun Yadav', 'arjunyadav@example.com', 'Arjun@2024', 'Delhi', '7654321097', 'arjunyadav', '2023-11-17', '2023-11-17 09:15:00', TRUE, 'M', 'Hindi'),"
                + "(14, 'Maya Verma', 'mayaverma@example.com', 'Maya@2024', 'Kolkata', '6543210986', 'mayaverma', '2023-10-12', '2023-10-12 14:45:00', TRUE, 'F', 'Bengali'),"
                + "(15, 'Rohit Shah', 'rohitshah@example.com', 'Rohit@2024', 'Ahmedabad', '9432109875', 'rohitshah', '2023-09-22', '2023-09-22 11:30:00', TRUE, 'M', 'Gujarati'),"
                + "(16, 'Anjali Thakur', 'anjalithakur@example.com', 'Anjali@2024', 'Jaipur', '6321098764', 'anjalithakur', '2023-08-14', '2023-08-14 15:00:00', TRUE, 'F', 'Hindi'),"
                + "(17, 'Yash Patil', 'yashpatil@example.com', 'Yash@2024', 'Pune', '9210987653', 'yashpatil', '2023-07-05', '2023-07-05 10:15:00', TRUE, 'M', 'Marathi'),"
                + "(18, 'Aditi Singh', 'aditisingh@example.com', 'Aditi@2024', 'Lucknow', '6109876542', 'aditisingh', '2023-06-01', '2023-06-01 13:30:00', TRUE, 'F', 'Hindi'),"
                + "(19, 'Arvind Kumar', 'arvindkumar@example.com', 'Arvind@2024', 'Bangalore', '8098765431', 'arvindkumar', '2023-05-10', '2023-05-10 09:45:00', TRUE, 'M', 'Kannada'),"
                + "(20, 'Sharika Patil', 'sharikapatil@example.com', 'Sharika@2024', 'Bangalore', '9678787891', 'sharikapatil', '2023-05-10', '2024-02-10 09:25:00', TRUE, 'F', 'Kannada')";

        String readQuery = "select * from useraccount_table";
        String nameQuery = "select name from useraccount_table where email='yashpatil@example.com' and password='Yash@2024'";
        String addressQuery = "select address from useraccount_table where name='Ishita Patel' and phone_number=8765432109";
        String emailQuery = "select email,password from useraccount_table where phone_number=9678787891";
        String emailAndPwdQuery = "select email,password from useraccount_table where phone_number=7654321097 and name='Arjun Yadav'";
        String nameQuery1 = "select name from useraccount_table where id>=10";

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
				System.out.println("Password: " + resultSet.getString("password"));
				System.out.println("Address: " + resultSet.getString("address"));
				System.out.println("phone_number: " + resultSet.getString("phone_number"));
				System.out.println("username: " + resultSet.getString("username"));
				System.out.println("account_creation_date: " + resultSet.getDate("account_creation_date"));
				System.out.println("last_login: " + resultSet.getTimestamp("last_login"));
				System.out.println("Is Active: " + resultSet.getBoolean("is_active"));
				System.out.println("Gender: " + resultSet.getString("gender"));
				System.out.println("language_preference: " + resultSet.getString("language_preference"));

				System.out.println("-----------------------------");
			}
            Statement statement1 = connection.createStatement();
            ResultSet resultSet1 = statement1.executeQuery(nameQuery);
            if (resultSet1.next()) {
                String userName = resultSet1.getString("name");
                System.out.println("Name found: " + userName);
            } else {
                System.out.println("No record found ");
            }
            System.out.println("==================");

            Statement statement2 = connection.createStatement();
            ResultSet resultSet2 = statement2.executeQuery(addressQuery);
            if (resultSet2.next()) {
                String address1 = resultSet2.getString("address");
                System.out.println("Address found: " + address1);
            } else {
                System.out.println("No record found ");
            }
            System.out.println("==================");

            Statement statement3 = connection.createStatement();
            ResultSet resultSet3 = statement3.executeQuery(emailQuery);
            if (resultSet3.next()) {
                String email = resultSet3.getString("email");
                String pwd = resultSet3.getString("password");

                System.out.println("Email found: " + email + " Password found: " + pwd);
            } else {
                System.out.println("No record found ");
            }
            System.out.println("==================");

            Statement statement4 = connection.createStatement();
            ResultSet resultSet4 = statement4.executeQuery(emailAndPwdQuery);
            if (resultSet4.next()) {
                String email = resultSet4.getString("email");
                String pwd = resultSet4.getString("password");

                System.out.println("Email found: " + email + " Password found: " + pwd);
            } else {
                System.out.println("No record found ");
            }
            System.out.println("==================");
            
            Statement statement5= connection.createStatement();
			ResultSet resultSet5=statement5.executeQuery(nameQuery1);
			
			while(resultSet5.next()) {
				System.out.println(resultSet5.getString("name"));
			}
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
