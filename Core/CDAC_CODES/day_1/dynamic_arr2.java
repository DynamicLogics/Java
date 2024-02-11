import java.util.*;

class dynamic_arr1
{
public static void main(String args[])	
{
Scanner scan=new Scanner(System.in);
int b[][]=new int[2][];

	b[0]=new int[5];
	b[1]=new int[2];
	
	for(int i=0;i<b.length;i++)
	{
		System.out.println("Enter the"+b[i].length+"numbers");
		for(int j=0;j<b[i].length;j++)
		{
				b[i][j]=Integer.parseInt(scan.next());
		}
	}
	
	System.out.println("Output Array is:");
	System.out.println("");
	for(int i=0;i<b.length;i++)
	{
		for(int j=0;j<b[i].length;j++)
		{
				System.out.print(b[i][j]);
		}System.out.println("");
	}
	
}
}
