package com.zensar.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ScrollableResulrSet {

	public static void main(String[] args) {
		
		
		
	
		
		try (Connection con=ConnectionProvider.getConnection();Statement smt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);ResultSet rs=smt.executeQuery("select * from employee");){//making statement scrollable and updatable
			
			rs.absolute(1);
			rs.updateString(2,"akash");
			rs.updateRow();
			rs.moveToInsertRow();//inserting data from last row
			rs.updateInt(1,245);
			rs.updateString(2, "jitesh");
			rs.updateInt(3,345);
			rs.insertRow();
			System.out.println("Batch updated Successfully.");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
