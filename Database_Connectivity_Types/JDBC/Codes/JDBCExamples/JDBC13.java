import java.sql.*;
class JDBC13
{
     public static void main(String args[])
     {
          Connection cn;
          Statement s;
          ResultSet rs;
          try
          {
               Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               cn=DriverManager.getConnection("jdbc:odbc:mca","scott","tiger");
               s=cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
               rs=s.executeQuery("select * from employee order by eno");
               System.out.println("Backward Traversing of records :");
               rs.afterLast();
               while(rs.previous())
               System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));

               System.out.println("\n\nForward Traversing of records :");
               rs.beforeFirst();
               while(rs.next())
               System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));

               System.out.println("\n\nusing absolute");
               rs.absolute(-5);
               System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));

               System.out.println("\n\nusing relative");
               rs.absolute(2);
               System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));

          }catch(Exception e){System.out.println(e);}
     }
}
