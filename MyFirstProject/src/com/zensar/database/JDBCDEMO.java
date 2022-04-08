package com.zensar.database;

import java.sql.Connection;
import java.sql.Statement;

import com.mysql.cj.jdbc.DatabaseMetaData;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBCDEMO {
	public static void main(String[] args) {
		Connection con = null;
		Statement smt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// this line is optional for current java //ClassNotFoundException
			con = DriverManager.getConnection(
					"jdbc:mysql://my-database.cm6hqiqhanoc.ap-south-1.rds.amazonaws.com:/batch22", "root",
					"ZensarRoot");// SQLException
			// Connection con = DriverManager.getConnection(
			// "jdbc:mysql://localhost:3306/batch22", "root", "root");
			// or
			// Connection con = DriverManager.getConnection(
			// "jdbc:mysql://127.0.0.1:3306/batch22", "root", "root");
			DatabaseMetaData databaseMetaData = (DatabaseMetaData) con.getMetaData();
			System.out.println(databaseMetaData.getSQLKeywords());
			smt = con.createStatement();
			ResultSet rs = smt.executeQuery("select * from employee");
			ResultSetMetaData rsmd = rs.getMetaData();
			for (int i = 1; i <= rsmd.getColumnCount(); i++) {
				System.out.print(rsmd.getColumnName(i) + " ");
				System.out.println(rsmd.getColumnTypeName(i));

			}

			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
			}
			System.out.println("Connected");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
