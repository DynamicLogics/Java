import java.sql.*;
class JDBC12
{
     public static void main(String args[])
     {
          Connection cn;
          Statement s;
          ResultSet rs;
          ResultSetMetaData rsmd;
          try
          {
               Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               cn=DriverManager.getConnection("jdbc:odbc:mca","scott","tiger");
               s=cn.createStatement();
               rs=s.executeQuery("select * from employee");
               rsmd=rs.getMetaData();
               int noc=rsmd.getColumnCount();
               for(int i=1;i<=noc;i++)
               {
                    System.out.println("Details of "+i+" column");
                    System.out.println("Column Name : "+rsmd.getColumnName(i));
                    System.out.println("Column Type : "+rsmd.getColumnTypeName(i));
                    System.out.println("Scale       : "+rsmd.getScale(i));
                    System.out.println("Precision   : "+rsmd.getPrecision(i));
                    System.out.println();
              }

          }catch(Exception e){System.out.println(e);}
     }
}
