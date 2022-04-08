package com.zensar.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertNewDemo {

	public static void main(String[] args) {
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");//For loading the Driver (throws ClassNotFoundException)
				Connection con = DriverManager.getConnection(
						"jdbc:mysql://my-database.cm6hqiqhanoc.ap-south-1.rds.amazonaws.com:/batch22", "root",
						"ZensarRoot");//getting connected to database (Throws SQLException)
				Statement smt=con.createStatement();
				Scanner scanner=new Scanner(System.in);
				int id=scanner.nextInt();
				String name=scanner.next();
				int age=scanner.nextInt();
				
				int count=smt.executeUpdate("insert into student values("+id+",'"+name+"',"+age+");");
				if(count>0) {
					System.out.println("Deleted Successfully");
				}else {
					System.out.println("Not Deleted");
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
