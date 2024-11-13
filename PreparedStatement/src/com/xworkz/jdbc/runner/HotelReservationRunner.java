package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.jdbc.constant.ReservationConstant;

public class HotelReservationRunner {

	public static void main(String[] args) {

		try (Connection connection = DriverManager.getConnection(ReservationConstant.URL.getValue(),
				ReservationConstant.USER.getValue(), ReservationConstant.PASSWORD.getValue())) {
			PreparedStatement prst = connection.prepareStatement("insert into reservation_table values(?,?,?,?,?)");

			prst.setInt(1, 1);
			prst.setString(2, "John Doe");
			prst.setString(3, "Single");
			prst.setDate(4, java.sql.Date.valueOf("2024-12-01"));
			prst.setDate(5, java.sql.Date.valueOf("2024-12-05"));
			prst.executeUpdate();

			prst.setInt(1, 2);
			prst.setString(2, "Jane Smith");
			prst.setString(3, "Double");
			prst.setDate(4, java.sql.Date.valueOf("2024-12-02"));
			prst.setDate(5, java.sql.Date.valueOf("2024-12-06"));
			prst.executeUpdate();

			prst.setInt(1, 3);
			prst.setString(2, "Emily Johnson");
			prst.setString(3, "Suite");
			prst.setDate(4, java.sql.Date.valueOf("2024-12-03"));
			prst.setDate(5, java.sql.Date.valueOf("2024-12-07"));
			prst.executeUpdate();

			prst.setInt(1, 4);
			prst.setString(2, "Michael Brown");
			prst.setString(3, "Single");
			prst.setDate(4, java.sql.Date.valueOf("2024-12-04"));
			prst.setDate(5, java.sql.Date.valueOf("2024-12-08"));
			prst.executeUpdate();

			prst.setInt(1, 5);
			prst.setString(2, "Sarah Davis");
			prst.setString(3, "Double");
			prst.setDate(4, java.sql.Date.valueOf("2024-12-05"));
			prst.setDate(5, java.sql.Date.valueOf("2024-12-09"));
			prst.executeUpdate();

			prst.setInt(1, 6);
			prst.setString(2, "David Wilson");
			prst.setString(3, "Triple");
			prst.setDate(4, java.sql.Date.valueOf("2024-12-06"));
			prst.setDate(5, java.sql.Date.valueOf("2024-12-10"));
			prst.executeUpdate();

			prst.setInt(1, 7);
			prst.setString(2, "Olivia Martinez");
			prst.setString(3, "Double");
			prst.setDate(4, java.sql.Date.valueOf("2024-12-07"));
			prst.setDate(5, java.sql.Date.valueOf("2024-12-11"));
			prst.executeUpdate();

			prst.setInt(1, 8);
			prst.setString(2, "Liam Garcia");
			prst.setString(3, "Single");
			prst.setDate(4, java.sql.Date.valueOf("2024-12-08"));
			prst.setDate(5, java.sql.Date.valueOf("2024-12-12"));
			prst.executeUpdate();

			prst.setInt(1, 9);
			prst.setString(2, "Sophia Rodriguez");
			prst.setString(3, "Suite");
			prst.setDate(4, java.sql.Date.valueOf("2024-12-09"));
			prst.setDate(5, java.sql.Date.valueOf("2024-12-13"));
			prst.executeUpdate();

			prst.setInt(1, 10);
			prst.setString(2, "James Taylor");
			prst.setString(3, "Family");
			prst.setDate(4, java.sql.Date.valueOf("2024-12-10"));
			prst.setDate(5, java.sql.Date.valueOf("2024-12-14"));
			prst.executeUpdate();

			prst.setInt(1, 11);
			prst.setString(2, "Mia Anderson");
			prst.setString(3, "Double");
			prst.setDate(4, java.sql.Date.valueOf("2024-12-11"));
			prst.setDate(5, java.sql.Date.valueOf("2024-12-15"));
			prst.executeUpdate();

			prst.setInt(1, 12);
			prst.setString(2, "Benjamin Thomas");
			prst.setString(3, "Single");
			prst.setDate(4, java.sql.Date.valueOf("2024-12-12"));
			prst.setDate(5, java.sql.Date.valueOf("2024-12-16"));
			prst.executeUpdate();

			prst.setInt(1, 13);
			prst.setString(2, "Isabella Jackson");
			prst.setString(3, "Suite");
			prst.setDate(4, java.sql.Date.valueOf("2024-12-13"));
			prst.setDate(5, java.sql.Date.valueOf("2024-12-17"));
			prst.executeUpdate();

			prst.setInt(1, 14);
			prst.setString(2, "Alexander White");
			prst.setString(3, "Triple");
			prst.setDate(4, java.sql.Date.valueOf("2024-12-14"));
			prst.setDate(5, java.sql.Date.valueOf("2024-12-18"));
			prst.executeUpdate();

			prst.setInt(1, 15);
			prst.setString(2, "Charlotte Harris");
			prst.setString(3, "Double");
			prst.setDate(4, java.sql.Date.valueOf("2024-12-15"));
			prst.setDate(5, java.sql.Date.valueOf("2024-12-19"));
			prst.executeUpdate();

			System.out.println("values are inserted");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
