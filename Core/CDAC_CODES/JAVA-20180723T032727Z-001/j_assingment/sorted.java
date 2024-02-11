import java.util.*;
class sorted
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		
		int i=Integer.parseInt(scan.next());
		
		int a[][]=new int [i][];
		
		int k=Integer.parseInt(scan.next());
		
		for(i=0;i<a.length;i++)
		{
		  a[i]=new int[k];
		}
		
		int j;
		
		for(int q=0;q<a.length;q++)
		{
			for(j=0;j<a[q].length;j++)
			{
			  a[q][j]=Integer.parseInt(scan.next());
			}
		}
	 
	for(int q=0;q<a.length;q++)
		{
			for(j=0;j<a[q].length;j++)
			{
			// System.out.println(a[q][j]);
			
	if(a[q][0]>a[q][j])
	{
	 System.out.println(a[q][0]);	
	}
			}
	}
	
	
	
	}

}

