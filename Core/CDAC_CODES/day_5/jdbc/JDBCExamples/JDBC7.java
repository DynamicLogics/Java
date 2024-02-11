//insert record in database using preparedStatement

import java.sql.*;
import java.io.*;
class JDBC7
{
     public static void main(String args[])
     {
          Connection cn;
          PreparedStatement ps;
          char ch='y';
          try
          {
               Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               cn=DriverManager.getConnection("jdbc:odbc:mca","scott","tiger");
               ps=cn.prepareStatement("insert into employee values(?,?,?)");
               do
               {
                    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                    System.out.print("Enter the empno==>");
                    int n=Integer.parseInt(br.readLine());
                    System.out.print("Enter the name==>");
                    String name=br.readLine();
                    System.out.print("Enter the Salary==>");
                    int s=Integer.parseInt(br.readLine());
                    ps.setInt(1,n);
                    ps.setString(2,name);
                    ps.setInt(3,s);
                    ps.executeUpdate();
                    System.out.println("Record inserted successfully...!!!");
                    System.out.print("Do u want to continue : ");
                    ch=br.readLine().charAt(0);
               }while(ch=='y');
               cn.close();
               ps.close();

          }catch(Exception e){System.out.println(e);}

     }
}
