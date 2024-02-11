import java.sql.*;
class JDBC3
{
     public static void main(String args[])  
	{
          Connection cn;
          Statement s;
          ResultSet rs;
          try
          { 
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               cn=DriverManager.getConnection("jdbc:odbc:mca","scott","tiger");
               s=cn.createStatement();
               rs=s.executeQuery("Select * from employee order by eno");
               while(rs.next())
               {
                    System.out.println("Emp No    : "+rs.getInt(1));
                    System.out.println("Name      : "+rs.getString(2));
                    System.out.println("Emp sal   : "+rs.getInt(3)+"\n\n");
               }
               System.out.println("Cursor Name : "+rs.getCursorName());

               cn.close();
               s.close();

          }catch(Exception e){System.out.println(e);}
	}
}
