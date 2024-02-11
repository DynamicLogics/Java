abstract class A
{
	public void Adisplay()
	{
		System.out.println("Display A...");	
	}
	public abstract void display();//Abstract method can't have a body
	//In abstract we can define our own reules also
	//like in above mthod if i want only two parameters to dispalyed in its child
	//so i should define it this way: public abstract void display(int a,int b);
	//so now compulsarily all it's chils should contain two parameters.
}         

class B extends A
{
	public void display()
	{
		System.out.println("You are abstract class of B...");	
	}
	public void showValue()
	{
		
	}
}

class AbstractClass
{
	public static void main(String args[])
	{
		B obj=new B();
		obj.display();
	}
}