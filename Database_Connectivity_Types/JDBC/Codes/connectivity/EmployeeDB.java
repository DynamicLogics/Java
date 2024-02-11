package allFiles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;

public class EmployeeDB 
{

	public static void main(String[] args) throws Exception
	{	
		Scanner scan = new Scanner(System.in);
		
		employee e1 = new employee();
		
		Class.forName("org.postgresql.Driver");
		Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres","postgres","cdac123");
		
		System.out.println("enter employee number:");
		int empno = Integer.parseInt(scan.next());
		
		System.out.println("enter employee name:");
		String ename = scan.next();
		
		System.out.println("enter employee salary:");
		int salary = Integer.parseInt(scan.next());
		
		System.out.println("enter department name:");
		String department = scan.next();
		
		
		PreparedStatement ps = connection.prepareStatement("insert into employee values(?,?,?,?)");
		
		ps.setInt(1,e1.getEmpno() );
		ps.setString(2,e1.getEname());
		ps.setInt(3,e1.getSalary());
		ps.setString(4,e1.getDepartment());
		
	}

}
