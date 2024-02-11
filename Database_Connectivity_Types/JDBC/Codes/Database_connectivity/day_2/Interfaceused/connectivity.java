package Interfaceused;

import java.sql.Connection;
import java.sql.DriverManager;

public interface connectivity 
{

	public interface Connectivity
	{
		String LOADDRIVER = "org. postgresql.Driver";
		String BDCONNECTION = "jdbc:postgresql://localhost:5432/postgres";
		String USERNAME = "postgres";
		String PASSWORD = "cdac123";
		
	public static Connection getConnectivity() throws Exception
	{
			Class.forname (LOADDRIVER);
			Connection connection = DriverManager.getConnection(BDCONNECTION,USERNAME);
			return connection;
			
			
	}


	}
	
}
