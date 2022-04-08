package com.zensar.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateRecord {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// For loading the Driver (throws ClassNotFoundException)
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://my-database.cm6hqiqhanoc.ap-south-1.rds.amazonaws.com/batch22", "root", "ZensarRoot");
			Statement smt = con.createStatement();
			System.out.println("Enter id you want to delete");
			Scanner scanner = new Scanner(System.in);
			int id = scanner.nextInt();
			String name = scanner.next();
			int age = scanner.nextInt();

			int count = smt.executeUpdate("update student set studentName="+name+"where studentId="+id+";");
			int count1 = smt.executeUpdate("update student set studentAge="+age+"where studentId="+id+";");

			if (count > 0 &&count1>0) {
				System.out.println("Updated Successfully");
			} else {
				System.out.println("Not Updated");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
}
