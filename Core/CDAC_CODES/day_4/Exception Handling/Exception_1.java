class Division
{
int x,y;

public void div(int a,int y)
	{
	try
	{
	System.out.println("Division: "+(x/y));	
	}

	catch(ArithmeticException e)//ArithematicException=is class and it's error also e=object
		{
			System.out.println("Cannot divide by zero...");
		}
	}
}

class Exception_1
{
public static void main(String args[])
{
Division a1=new Division();
a1.div(10,0);
}
}



