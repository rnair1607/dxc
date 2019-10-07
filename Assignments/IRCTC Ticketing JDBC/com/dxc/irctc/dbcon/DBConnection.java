package com.dxc.irctc.dbcon;
import java.sql.*;


public class DBConnection {
	public DBConnection() {
		
	}
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 Connection connection = null;
		 
		 try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dxc","root","root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return connection;
		 
		
	}

}
