package com.zensar.database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallableDemo {
	public static void main(String[] args) {
		Connection con=null;
		CallableStatement cstmt=null;
		
		con=ConnectionProvider.getConnection();
		try {
			cstmt=con.prepareCall("{call updateEmpAge(?,?)}");
			cstmt.setInt(1, 1001);
			cstmt.registerOutParameter(2, java.sql.Types.INTEGER);
			cstmt.executeUpdate();
			cstmt.getInt(2);
			System.out.println("Employee Age is:");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
