/*relative(n)
absolute(n)
previous()
next()*/
import java.sql.*;
class jdb16
{
     public static void main(String args[])
     {
          Connection cn;
          Statement stat;
          ResultSet rs;
          try
          {
               Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               cn=DriverManager.getConnection("jdbc:odbc:mca","scott","tiger");
               stat=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
               rs=stat.executeQuery("Select * from employee where eno<=4 order by eno");
               rs.afterLast();
               while(rs.previous())
               {
                    
                    System.out.println(rs.getString(1)+rs.getString(2)+rs.getString(3));


               }
               System.out.println("\n\n");

           //      rs.beforeFirst();
                 while(rs.next())
                 {
                   System.out.println(rs.getString(1)+rs.getString(2)+rs.getString(3));
                 }
               System.out.println("\n\n");
               

                 //rs.beforeFirst();
                 rs.absolute(4);
                 System.out.println(rs.getString(1)+rs.getString(2)+rs.getString(3));
                // rs.afterLast();
                 rs.relative(-1);
                 System.out.println(rs.getString(1)+rs.getString(2)+rs.getString(3));
              }catch(Exception e){}
          }
}
