import java.util.*;
class ObjectArrayExample1
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		// int a[] = new int[5]
		Human_dynamic1 objarr[]=new Human_dynamic1[5]; // creating empty array of object 

for(int i=0;i<objarr.length;i++)
{
	objarr[i]=new Human_dynamic1();//creating object
	System.out.println("Enter name:");
	String name=scan.next();
	System.out.println("Enter age:");
	 int age=Integer.parseInt(scan.next());
	System.out.println("Enter gender:");
	String gender=scan.next();
	System.out.println("Enter addhar:");
	long addhar=Long.parseLong(scan.next());
	objarr[i].setHuman(name,age,gender,addhar);
}	

for(int i=0;i<objarr.length;i++)
{

	objarr[i].getHuman();
}	

	}
}





