package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import BeansUsed.Studentmarks2;

public class StudentMarksDao implements StudentMarksConnectivity
{
	public void save(Studentmarks2 student)
	
	{
		try
		{
		Connection connection = StudentMarksConnectivity.getConnectivity();
		String query = "insert into studentmarks values(?,?,?,?,?,?,?)";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, student.getName());//getBookPK());
		ps.setInt(2, student.getCpp());
		ps.setInt(3, student.getJava());	
		ps.setInt(4, student.getOs());
		ps.setInt(5, student.getTotal());
		ps.setFloat(6, student.getPercentage());
		int value = ps.executeUpdate();
		if(value>0)
		{
			System.out.println("Record Inserted....");
		}
		else
		{
			System.out.println("Record Not Inserted....");
		}
		connection.close();
		}
		catch(Exception e)
		{
			System.out.println("Error "+e);
			
		}
	}
		
	public int nextID()
	{
		try
		{
			Connection connection = StudentMarksConnectivity.getConnectivity();
			String query  = "select max(id) from studentmarks";
			
			
			
		}
		catch
		{
			
		}
		
		return 0;
	}
	
	
	
	
		
	}
	
	

