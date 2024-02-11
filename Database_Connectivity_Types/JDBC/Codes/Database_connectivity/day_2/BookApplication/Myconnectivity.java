package BookApplication;

import java.sql.Connection;
import java.sql.DriverManager;

// in this we are declaring comman class for connectivity which can be use in all other 
// classes for connection so that we don't have to declare "forname" and "connection" again and again

public class Myconnectivity 
{
	
		public static Connection getConnectivity() throws Exception
		{
			Class.forName ("org.postgresql.Driver");
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","cdac123");
			return connection;
				
				
		}


		}
