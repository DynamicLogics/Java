class Exception
{
	public static void main(String args[])
	{
		int x=0;
		int y=0;
		
		try
		{
			x=Integer.parseInt(args[0]);
			y=Integer.parseInt(args[1]);
			System.out.println("Division: "+(x/y));
		}
		
		catch(ArrayIndexOutOfBoundsException e)//ArrayIndexOutOfBound=is class and it's error also e=object
		{
			System.out.println("Parameter not passed while execution...");
		}
		
		catch(ArithmeticException e)//ArithematicException=is class and it's error also e=object
		{
			System.out.println("Cannot divide by zero...");
		}
		
		/*catch(Exception e)
		{
			System.out.println("Error"+e);
		}*/
		
		System.out.println("Multiplication: "+(x*y));
	}
}