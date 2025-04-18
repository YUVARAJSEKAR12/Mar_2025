package com.app.db;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Exe {
	
	public static void main(String[] args) {
		
		try {
			ResultSet rs = DB_Reuse.db_Read(Constant.city);
			while(rs.next()) {
			System.out.println(rs.getString(1));	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
