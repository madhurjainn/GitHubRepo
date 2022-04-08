package com.zensar.database;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionProvider {
	static Connection con = null;

	public static Connection getConnection() {

		try {
			Properties properties=new Properties();
			properties.load(new FileReader("db.properties"));//for reading db.properties file.
			String driverName=properties.getProperty("driver");
			String jdbcUrl=properties.getProperty("jdbcUrl");
			String userName=properties.getProperty("username");
			String password=properties.getProperty("password");
			
			Class.forName(driverName);// For loading the Driver (throws ClassNotFoundException)
			con = DriverManager.getConnection(jdbcUrl,userName,password);// getting connected to database (Throws SQLException)

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;

	}

}
