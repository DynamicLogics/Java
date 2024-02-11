import java.sql.*;
class JDBC5
{
     public static void main(String args[])
     {
          Connection cn;
          Statement s;
          try
          {
               if(args.length==0)
               System.out.println("Please enter empno,sal as command line argument...!!!");
               else if(args.length==1)
               System.out.println("Please enter empno,sal as command line argument...!!!");
               else 
               {
                    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                    cn=DriverManager.getConnection("jdbc:odbc:mca","scott","tiger");
                    s=cn.createStatement();
                    int n=Integer.parseInt(args[0]);
                    int sal=Integer.parseInt(args[1]);
                    int i=s.executeUpdate("update employee set sal=sal+"+sal+" where eno="+n);
                    if(i==0)
                    System.out.println("Record for empno "+n+" does not exist...!!!");
                    else
                    System.out.println("Record updated successfully...!!!");
                    cn.close();
                    s.close();
               }
          }catch(Exception e){System.out.println(e);}
     }
}
