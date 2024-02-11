package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {
	
	private static void name(String[]args) {
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user = "hbstudent";
		String password = "hbstudent";
		
		try {
			
			System.out.println("connecting to database "+jdbcUrl+"...");
			
			Connection databaseConnect = DriverManager.getConnection(jdbcUrl,user,password);
			
			System.out.println("database connection successful...");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
