package Assing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.util.*;

public class BankDatabase
{

	public static void main(String[] args) throws Exception
	{
		
		Class.forName("org.postgresql.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres","postgres","cdac123"); 
		
		Q1Class c1 = new Q1Class();
		
		Q1ClassSub cs1 = new Q1ClassSub();
		
		AbstractFile cs2 = new  AbstractFile(0, 0, 0);
		
		Scanner scan = new Scanner(System.in);
		
		
		
		PreparedStatement ps = connection.prepareStatement("insert into bank values(?,?,?,?,?,?)");
	
		
		

		ps.setString(1,c1.getBank_name());
		ps.setString(2,cs1.getName());
		ps.setInt   (3,cs1.getDeposite_amount());
		ps.setDouble(4,cs2.getRate_of_interst() );
		ps.setInt(5, cs2.getPeriod());
		ps.setInt(6,cs1.getDeposite_amount());
		
		int value = ps.executeUpdate();
	
		if(value>0)
		{
			System.out.println("Record Inserted....");
		}
		else
		{
			System.out.println("Record Not Inserted...");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
