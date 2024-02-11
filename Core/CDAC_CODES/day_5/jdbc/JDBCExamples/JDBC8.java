import java.sql.*;
import java.io.*;
class JDBC8
{
     public static void main(String args[])
     {
          Connection cn;
          PreparedStatement ps;
          ResultSet rs;
          char ch='y';
          try
          {
               Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               cn=DriverManager.getConnection("jdbc:odbc:mca","scott","tiger");
               ps=cn.prepareStatement("select * from employee where eno=?");
               do
               {
                    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                    System.out.print("Enter the empno :");
                    int n=Integer.parseInt(br.readLine());
                    ps.setInt(1,n);
                    rs=ps.executeQuery();
                    if(rs.next())
                    {
                         System.out.println("Emp No : "+rs.getInt(1));
                         System.out.println("Name   : "+rs.getString(2));
                         System.out.println("Salary : "+rs.getInt(3));
                         System.out.print("Do u want to continue : ");
                         ch=br.readLine().charAt(0);
                    }
                    else
                    {
                         System.out.print("Record for empno "+n+" does not exist...!!!");
                         System.exit(0);
                    }
                }while(ch=='y');
                cn.close();
                ps.close();
          }catch(Exception e){System.out.println(e);}
     }
}
