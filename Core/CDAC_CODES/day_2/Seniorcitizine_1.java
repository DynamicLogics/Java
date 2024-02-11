import java.util.*;
class Seniorcitizine_1
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		
Seniorcitizine objarr[]=new Seniorcitizine[2];

for(int i=0;i<objarr.length;i++)
{
	objarr[i]=new Seniorcitizine();//creating object
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

/*for(int i=0;i<objarr.length;i++)
{

	objarr[i].getHuman();
}*/
	
for(int i=0;i<objarr.length;i++)
{
if(objarr[i].getHuman_1()>=60)
{
	objarr[i].getHuman();
}
}


	}
}





