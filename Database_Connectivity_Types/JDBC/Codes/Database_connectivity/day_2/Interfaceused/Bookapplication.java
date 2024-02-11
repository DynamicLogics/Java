package Interfaceused;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Bookapplication 
{


	public static void main(String[] args) throws Exception
	{
	
		Book b1 = new Book("Magic Of Thinking Big","David",345,200);
		
		//b1.incrementBookid();
		
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","cdac123");
		String query = "insert into book values(?,?,?,?,?)";
		PreparedStatement ps = connection.prepareStatement(query);
		
		ps.setInt(1,getBookPK_1());
		ps.setString(2,b1.getBookName());
		ps.setString(3,b1.getBookAuthor());
		ps.setInt(4,b1.getPrice());
		ps.setInt(5,b1.getPageCount());

		int value = ps.executeUpdate();
		
		if (value>0)
			System.out.println("Record Inserted...");
		else
			System.out.println("Failed to insert Record Inserted...");
		
	}

	public static int getBookPK_1() throws ClassNotFoundException, SQLException
	{
		Class.forName("org.postgresql.Driver");
		Connection connection1 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","cdac123");
		String query1 = "select max(bookid) from book";
		Statement statement = connection1.createStatement();
		ResultSet rs = statement .executeQuery(query1);
		rs.next();
		int bookid= rs.getInt(1);
		Connection connection;
		return (bookid+1);	
	}
		
	}












