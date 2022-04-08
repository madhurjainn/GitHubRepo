package com.zensar.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDemo {

	public static void main(String[] args) {
		Connection con=null;
		Statement smt=null;
		Scanner scanner=null;
		try {
			con=ConnectionProvider.getConnection();
			int count=smt.executeUpdate("insert into student values(11,'Aman',24)");
			if(count>0) {
				System.out.println("Strored Successfully");
			}else {
				System.out.println("Not Stored");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
