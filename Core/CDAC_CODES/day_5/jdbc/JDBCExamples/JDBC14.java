import java.sql.*;
import java.io.*;
class JDBC14
{
     public static void main(String args[])
     {
          Connection cn;
          Statement s1,s2;
          ResultSet rs1,rs2;
          try
          {
               Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               cn=DriverManager.getConnection("jdbc:odbc:mca","scott","tiger");
               s1=cn.createStatement();
               s2=cn.createStatement();
               BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
               System.out.print("Enter the customer no :");        
               int n=Integer.parseInt(br.readLine());
               rs1=s1.executeQuery("select * from cust where cno="+n);
               if(rs1.next())
               {
                    System.out.println("cno   : "+rs1.getInt(1));
                    System.out.println("Name  : "+rs1.getString(2));        
                    System.out.println("City  : "+rs1.getString(3));
                    rs1=s1.executeQuery("select * from trans where cno="+n);
                    System.out.println("Item No    Item-Name    Rate    Qty    Amount");
                    double sal=0;
                    while(rs1.next())
                    {
                         
                         rs2=s2.executeQuery(" select * from item where ino="+rs1.getInt(1));
                         rs2.next();
                         double rate=rs2.getFloat(3);
                         int qty=rs1.getInt(3);
                         double amt=rate * qty;
                         System.out.println(rs2.getInt(1)+"    "+rs2.getString(2)+"    "+rate+"    "+qty+"    "+amt);
                         sal=sal+amt;
                    }
                    System.out.println("                 Total  : "+sal);

               }
               else
               System.out.println("Record for custno "+n+" does not exist...!!!");

          }catch(Exception e){System.out.println(e);}
     }
}
    

