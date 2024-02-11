package com.code;

import java.sql.Connection;
import java.sql.DriverManager;

public class Jdbc_COnnection_Check {

	public static void main(String[] args) {
	
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
