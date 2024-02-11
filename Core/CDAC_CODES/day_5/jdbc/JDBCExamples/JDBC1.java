import java.sql.*;
class JDBC1
{
     public static void main(String args[])
     {
          try
          {
               Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               Connection cn=DriverManager.getConnection("jdbc:odbc:mca","scott","tiger");
               Statement s=cn.createStatement();
               int i=s.executeUpdate("create table employee(eno number(3),name varchar2(40),sal number(5) check(sal>500))");
               if(i==0)
               System.out.println("Table cannot be created...!!!");
               else
               System.out.println("Table created successfully...!!!");
               cn.close();
               s.close();
           }catch(Exception e){System.out.println(e);}
     }
}

