package ServeletsUsed;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import sun.rmi.log.LogInputStream;


public class userdatabase 
{
	public void save(userclass dao)
	{
		
		try
		{
		Connection connection = StudentMarksConnectivity.getConnectivity();
		String query = "insert into userpasswordstore values(?,?)";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, dao.getName());//getBookPK());
		ps.setString(2, dao.getPassword());

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

	public void fetch(Login p)
	{
		
		try
		{
		Connection connection = StudentMarksConnectivity.getConnectivity();
		String query = "select * from userpasswordstore ";
		PreparedStatement ps = connection.prepareStatement(query);
		
		
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())
		{
			
			
		}
		
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
	
	
	
	
	
	
	
	
}
