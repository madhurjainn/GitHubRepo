package com.zensar.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDemo {{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");//For loading the Driver (throws ClassNotFoundException)
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://my-database.cm6hqiqhanoc.ap-south-1.rds.amazonaws.com:/batch22", "root",
				"ZensarRoot");//getting connected to database (Throws SQLException)
		Statement smt1=con.createStatement();
		int count=smt1.executeUpdate("delete from student where studentId=11");
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
