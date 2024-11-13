package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.jdbc.constant.LibraryConstant;

public class BookTrackingRunner {

	public static void main(String[] args) {

		try (Connection connection = DriverManager.getConnection(LibraryConstant.URL.getValue(),
				LibraryConstant.USER.getValue(), LibraryConstant.PASSWORD.getValue())) {
			PreparedStatement prst = connection.prepareStatement("insert into book_tracking_table values(?,?,?,?,?)");

			prst.setInt(1, 1);
			prst.setString(2, "To Kill a Mockingbird");
			prst.setString(3, "Harper Lee");
			prst.setString(4, "Fiction");
			prst.setInt(5, 1960);
			int value1 = prst.executeUpdate();

			prst.setInt(1, 2);
			prst.setString(2, "1984");
			prst.setString(3, "George Orwell");
			prst.setString(4, "Dystopian");
			prst.setInt(5, 1949);
			int value2 = prst.executeUpdate();

			prst.setInt(1, 3);
			prst.setString(2, "Pride and Prejudice");
			prst.setString(3, "Jane Austen");
			prst.setString(4, "Romance");
			prst.setInt(5, 1813);
			int value3 = prst.executeUpdate();

			prst.setInt(1, 4);
			prst.setString(2, "The Great Gatsby");
			prst.setString(3, "F. Scott Fitzgerald");
			prst.setString(4, "Fiction");
			prst.setInt(5, 1925);
			int value4 = prst.executeUpdate();

			prst.setInt(1, 5);
			prst.setString(2, "Moby Dick");
			prst.setString(3, "Herman Melville");
			prst.setString(4, "Adventure");
			prst.setInt(5, 1851);
			int value5 = prst.executeUpdate();

			prst.setInt(1, 6);
			prst.setString(2, "War and Peace");
			prst.setString(3, "Leo Tolstoy");
			prst.setString(4, "Historical");
			prst.setInt(5, 1869);
			int value6 = prst.executeUpdate();

			prst.setInt(1, 7);
			prst.setString(2, "The Catcher in the Rye");
			prst.setString(3, "J.D. Salinger");
			prst.setString(4, "Fiction");
			prst.setInt(5, 1951);
			int value7 = prst.executeUpdate();

			prst.setInt(1, 8);
			prst.setString(2, "The Hobbit");
			prst.setString(3, "J.R.R. Tolkien");
			prst.setString(4, "Fantasy");
			prst.setInt(5, 1937);
			int value8 = prst.executeUpdate();

			prst.setInt(1, 9);
			prst.setString(2, "Crime and Punishment");
			prst.setString(3, "Fyodor Dostoevsky");
			prst.setString(4, "Psychological Fiction");
			prst.setInt(5, 1866);
			int value9 = prst.executeUpdate();

			prst.setInt(1, 10);
			prst.setString(2, "The Odyssey");
			prst.setString(3, "Homer");
			prst.setString(4, "Epic");
			prst.setInt(5, -800);
			int value10 = prst.executeUpdate();

			prst.setInt(1, 11);
			prst.setString(2, "Brave New World");
			prst.setString(3, "Aldous Huxley");
			prst.setString(4, "Dystopian");
			prst.setInt(5, 1932);
			int value11 = prst.executeUpdate();

			prst.setInt(1, 12);
			prst.setString(2, "Jane Eyre");
			prst.setString(3, "Charlotte Bronte");
			prst.setString(4, "Gothic");
			prst.setInt(5, 1847);
			int value12 = prst.executeUpdate();

			prst.setInt(1, 13);
			prst.setString(2, "Wuthering Heights");
			prst.setString(3, "Emily Bronte");
			prst.setString(4, "Gothic");
			prst.setInt(5, 1847);
			int value13 = prst.executeUpdate();

			prst.setInt(1, 14);
			prst.setString(2, "The Divine Comedy");
			prst.setString(3, "Dante Alighieri");
			prst.setString(4, "Epic");
			prst.setInt(5, 1320);
			int value14 = prst.executeUpdate();

			prst.setInt(1, 15);
			prst.setString(2, "Hamlet");
			prst.setString(3, "William Shakespeare");
			prst.setString(4, "Tragedy");
			prst.setInt(5, 1603);
			int value15 = prst.executeUpdate();
			if (value1 > 0 && value2 > 0 && value3 > 0 && value4 > 0 && value5 > 0 && value6 > 0 && value7 > 0
					&& value8 > 0 && value9 > 0 && value10 > 0 && value11 > 0 && value12 > 0 && value13 > 0
					&& value14 > 0 && value15 > 0) {
				System.out.println("values are inserted");
			} else {
				System.out.println("values are not inserted.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
