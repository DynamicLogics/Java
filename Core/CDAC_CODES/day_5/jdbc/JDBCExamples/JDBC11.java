//program using callableStatement

import java.sql.*;
import java.io.*;
class JDBC11
{
     public static void main(String args[])
     {
          Connection cn;
          CallableStatement cs;
          try
          {
               Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               cn=DriverManager.getConnection("jdbc:odbc:mca","scott","tiger");
               cs=cn.prepareCall("{call proc(?,?,?)}");
               BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
               System.out.print("Enter the number : ");
               int n=Integer.parseInt(br.readLine());
               cs.setInt(1,n);
               cs.registerOutParameter(2,java.sql.Types.INTEGER);
               cs.registerOutParameter(3,java.sql.Types.FLOAT);
               cs.execute();
               System.out.println("Sum   : "+cs.getInt(2));
               System.out.println("Average   : "+cs.getFloat(3));
          }catch(Exception e){System.out.println(e);}
     } 
 }

