package com.zensar.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DRecord {
	public static void main(String[] args) {
		Connection con=null;
		try {
			con = ConnectionProvider.getConnection();
			Statement smt = con.createStatement();
			System.out.println("Enter id you want to delete");
			Scanner scanner = new Scanner(System.in);
			int id = scanner.nextInt();

			int count = smt.executeUpdate("delete from student where studentId=" + id + ";");
			if (count > 0) {
				System.out.println("Deleted Successfully");
			} else {
				System.out.println("Not Deleted");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
