package BookApplication;

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
		
		Connection connection = Myconnectivity.getConnectivity();
		
		String query = "insert into book values(?,?,?,?,?)";// '?=1,?=2,?=3,?=4,?=5' for storing of variables
		PreparedStatement ps = connection.prepareStatement(query);// here the query statement "build" occurs

		ps.setInt(1,getBookPK_1());//?=1 from here the output is given to the '?'  mark
		ps.setString(2,b1.getBookName());//?=2
		ps.setString(3,b1.getBookAuthor());//?=3 "if we replace 3 by 2 then bookname will be assigned to the authorname"
		ps.setInt(4,b1.getPrice());//?=4
		ps.setInt(5,b1.getPageCount());//?=5

		int value = ps.executeUpdate();//here the actual execution of query takes place
		
		if (value>0)
			System.out.println("Record Inserted...");
		else
			System.out.println("Failed to insert Record Inserted...");
		
	}

	public static int getBookPK_1() throws Exception
	{
		//Class.forName("org.postgresql.Driver");
		//Connection connection1 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","cdac123");
		Connection connection = Myconnectivity.getConnectivity();
		String query1 = "select max(bookid) from book";//query statement
		Statement statement = connection.createStatement();//for creating of statement
		ResultSet rs = statement .executeQuery(query1);//execution of query and 'rs' is storing executed query
		rs.next();//to see if next row is present
		int bookid= rs.getInt(1);//here we have max fun in in query and written '2' as we can have only one aggregrate function in a query
		
		return (bookid+1);//increment the primary key of particular row	
	}
		
	}













