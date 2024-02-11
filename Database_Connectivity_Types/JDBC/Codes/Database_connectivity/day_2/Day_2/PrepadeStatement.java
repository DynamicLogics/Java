package Day_2;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.PreparedStatement;

import java.sql.SQLException;


import java.util.*;

public class PrepadeStatement
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{

			Scanner scan=new Scanner(System.in);

			Class.forName("org.postgresql.Driver");
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","cdac123");

			String query = "insert into employee values(?,?,?,?)";
		
			System.out.println("How Many Records...");
				
			PreparedStatement ps = connection.prepareStatement(query);
				

			System.out.println("Enter Employee Number");
			int empno=Integer.parseInt(scan.next());	
			System.out.println("Enter Name");
			String ename=scan.next();	
			System.out.println("Enter salary");
			int salary=Integer.parseInt(scan.next());	
			System.out.println("Enter department");
			String department=scan.next();				

			
			ps.setInt(1,empno);
			ps.setString(2,ename);
			ps.setInt(3,salary);
			ps.setString(4,department);
			
			
		
		int value = ps.executeUpdate();
		
		if (value>0)
			System.out.println("Record Inserted...");
		}  	
	}

