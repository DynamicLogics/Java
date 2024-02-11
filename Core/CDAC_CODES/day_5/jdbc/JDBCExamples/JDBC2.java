import java.sql.*;
class JDBC2
{
     public static void main(String args[])
     {
          try
          {
               Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               Connection cn=DriverManager.getConnection("jdbc:odbc:mca","scott","tiger");
               Statement s=cn.createStatement();
               if(args.length!=3)
               System.out.println("Please enter empno,name,sal as command line arguments...!!!");
               else
               {
                    int eno=Integer.parseInt(args[0]);
                    String name=args[1];
                    float sal=Integer.parseInt(args[2]);
                    int i=s.executeUpdate("insert into employee values("+eno+",'"+name+"',"+sal+")");
                    if(i==0)
                    System.out.println("Record cannot be inserted...!!!");
                    else
                    System.out.println("Record inserted sucessfully...!!!");
                    cn.close();
                    s.close();
                }
          }catch(Exception e){System.out.println(e);}
     }
}
