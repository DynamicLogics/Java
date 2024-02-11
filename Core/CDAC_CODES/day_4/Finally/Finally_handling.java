import java.util.*;
class Finally_handling
	{
		public static void main(String arg[])
		{
			Scanner scan=new Scanner(System.in);
			int a[]=new int [5];
			System.out.println("Enter the 5 values");
		    int no=Integer.parseInt(scan.next());
			
			try
			{
				for(int i=0;i<6;i++)
				a[i]=Integer.parseInt(scan.next());
			}
			catch(Exception e)
			{
				System.out.println("Error:"+e);
			}
			finally
			{
				System.out.println("Inside Finally Block...");
			}
		}
	}
