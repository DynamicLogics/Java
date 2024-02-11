import java.util.*;
class Human_dynamic_main
{
	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
	Human_dynamic1 obj1 =new Human_dynamic1();

	System.out.println("Enter name:");
	String n1=scan.next();
	
	System.out.println("Enter age:");
	int a=Integer.parseInt(scan.next());
	
	System.out.println("Enter gender:");
	String g=scan.next();
	
	System.out.println("Enter addhar:");
	long adno=Long.parseLong(scan.next());
	
	obj1.setHuman(n1,a,g,adno);
	obj1.getHuman();

	}
	
}