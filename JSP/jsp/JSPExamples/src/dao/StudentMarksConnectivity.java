package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public interface StudentMarksConnectivity 
{
	String LOADDRIVER = "org.postgresql.Driver";
	String DBCONNECTION = "jdbc:postgresql://localhost:5432/postgres";
	String USERNAME = "postgres";
	String PASSWORD = "cdac123";
	
	public static Connection getConnectivity() throws Exception
	{
		Class.forName(LOADDRIVER);
		Connection connection = DriverManager.getConnection(DBCONNECTION,USERNAME,PASSWORD);
		return connection;
	}
	

	
	
}
