/*
Author: Shubham Ashtaputre
*/
class A
{
	int x;
	public void showAvalue()
	{
		System.out.println("X: "+x);
	}
}
class B extends A
{
    int x;
	int y;	
		public void showBvalue()
	{
		System.out.println("X: "+x);
		System.out.println("Y: "+y);
	}
}
class Overloading
{
	public static void main(String args[])
	{
		B obj=new B();
		obj.x=10;
		obj.y=100;
		
		obj.showBvalue();
		obj.showAvalue();//here value of A is being overloaded by child B class
	}
}
