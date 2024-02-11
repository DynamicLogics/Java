//program using callableStatement

import java.sql.*;
import java.io.*;
class JDBC10
{
     public static void main(String args[])
     {
          Connection cn;
          CallableStatement cs;
          try
          {
               Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               cn=DriverManager.getConnection("jdbc:odbc:mca","scott","tiger");
               cs=cn.prepareCall("{call upd(?,?)}");
               BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
               System.out.print("Enter the empno : ");
               int n=Integer.parseInt(br.readLine());
               System.out.print("Enter the Salary : ");
               int s=Integer.parseInt(br.readLine());
               cs.setInt(1,n);
               cs.setInt(2,s);
               cs.execute();
               System.out.println("Procedure successfully executed...!!!");
          }catch(Exception e){System.out.println(e);}
     }
}
