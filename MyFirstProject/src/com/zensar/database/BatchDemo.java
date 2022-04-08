package com.zensar.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class BatchDemo {

	public static void main(String[] args) {
		
		Connection con=null;
		Statement smt=null;
		
		
		con=ConnectionProvider.getConnection();
		try {
			smt=con.createStatement();
			con.setAutoCommit(false);
			smt.addBatch("insert into employee values(30,'Akash',100)");
			smt.addBatch("insert into employee values(87,'Anil',108)");
			smt.addBatch("insert into employee values(96,'Aniket',112)");
			smt.executeBatch();
			con.commit();
			System.out.println("Batch executed successfully");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
