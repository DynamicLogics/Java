interface MaxMin
{
	int MAX=100;
	int MIN=20;
	default void dispalyNumbers()
	{
		System.out.println("Display from MaxMin");
	}
}

class Number implements MaxMin
{
int no;
	public Number(int x)
	{
		no=x;
	}
	public void checkNumber()
	{
		if(no>MAX)
		{
			System.out.println("Number is greater than:"+MAX);
		}
		if(no<MIN)
		{
			System.out.println("Number is greater than:"+MIN);
		}
		if(no>MIN && no<MAX)
		{
			System.out.println("Number is between"+MAX+" and "+MIN);
		}
	}

}

class InterfaceExample
{
	public static void main(String arg[])
	{
		Number n1=new Number(7000000);
		n1.checkNumber();
		n1.dispalyNumbers();
	}
}
