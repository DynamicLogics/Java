import java.sql.*;
class JDBC4
{
     public static void main(String args[]) 
     {
          Connection cn;
          Statement s;
          ResultSet rs;
          try
          {
               if(args.length==0)
               System.out.println("Please enter empno as command line argument...!!!");
               else
               {
                    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                    cn=DriverManager.getConnection("jdbc:odbc:mca","scott","tiger");
                    s=cn.createStatement();
                    rs=s.executeQuery("select * from employee where eno="+args[0]);
                    if(rs.next())
                    {
                         System.out.println("Emp No    : "+rs.getString(1));
                         System.out.println("Name      : "+rs.getString(2));
                         System.out.println("Salary    : "+rs.getString(3));
                    }
                    else
                    System.out.println("Record for empno "+args[0]+" does not exist...!!!");
                    cn.close();
                    s.close();
                }
          }catch(Exception e){System.out.println(e);}
     }
}
