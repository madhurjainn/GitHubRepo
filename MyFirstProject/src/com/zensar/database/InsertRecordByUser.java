package com.zensar.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecordByUser {

	public static void main(String[] args) {
		Connection con = null;
		Statement smt = null;
		PreparedStatement pstmt=null;
		Scanner scanner = null;
		try {
			con = ConnectionProvider.getConnection();
			//smt = con.createStatement();
			scanner = new Scanner(System.in);
			System.out.println("Enter Student Id");
			int studentId = scanner.nextInt();
			System.out.println("Enter Name");
			String studentName = scanner.next();
			System.out.println("Enter Age");
			int studentAge = scanner.nextInt();
			pstmt=con.prepareStatement("insert into student values(?,?,?)");
			pstmt.setInt(1, studentId);//(column,value)
			pstmt.setString(2, studentName);
			pstmt.setInt(3, studentAge);
			int count=pstmt.executeUpdate();
			//int count = smt.executeUpdate("+studentId+",'"+studentName+"',"+studentAge+");");"
			if (count > 0) {
				System.out.println("Record Inserted Successfully");
			} else {
				System.out.println("Not Deleted");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (scanner != null) {
				scanner.close();
			}
			if (smt != null) {
				try {
					smt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
