package com.app.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Connection {
	public static void main(String[] args) {
		dbConnection();
	}
	
	public static void dbConnection() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = 
				DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306", "root", "Saikalai@123");
		Statement st = conn.createStatement();
		String query = "Select * from world.city";
		ResultSet rs = st.executeQuery(query);
		while(rs.next()) {
			System.out.println(rs.getString(2));
		}
		
		
		System.out.println("Connected");	
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}
	

}
