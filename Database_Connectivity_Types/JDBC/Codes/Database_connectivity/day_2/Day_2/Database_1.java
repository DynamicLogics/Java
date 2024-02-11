package Day_2 ;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Database_1 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","cdac123");
		Statement statement = connection.createStatement();
		String query="select * from employee";
		ResultSet resultset = statement.executeQuery(query);
		
		while(resultset.next())
		{
			System.out.println(resultset.getInt(1));
			System.out.println(resultset.getString(2));
			System.out.println(resultset.getInt(3));
			System.out.println(resultset.getString(4));
		}
		
	}

}
