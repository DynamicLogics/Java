//program using callableStatement
import java.sql.*;
import java.io.*;
class JDBC9
{
     public static void main(String args[])
     {
          Connection cn;
          CallableStatement cs;
          try
          {
               Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               cn=DriverManager.getConnection("jdbc:odbc:mca","scott","tiger");
               cs=cn.prepareCall("{?=call fact(?)}");
               System.out.print("Enter the number : ");
               BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
               int n=Integer.parseInt(br.readLine());
               cs.setInt(2,n);
               cs.registerOutParameter(1,java.sql.Types.INTEGER);
               cs.execute();
               System.out.println("Factorial = "+cs.getInt(1));
          }catch(Exception e){System.out.println(e);}
     }
}
