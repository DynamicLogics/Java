/*
Author: Shubham Ashtaputre
*/

class A
{
	int x;
	public void showvalue()
	{
		System.out.println("Base Class: "+x);
	}
}
class B extends A
{
    int x;
	int y;	
		public void showvalue(int a)
	{
		System.out.println("Derived Class: "+x);
		System.out.println("Derived Class: "+y);
	}
}
class Overriding
{
	public static void main(String args[])
	{
		B obj=new B();
	    	obj.x=10;
		obj.y=100;
		
		obj.showvalue(4);//here we have to pass parameter as we mentioned in class B
		obj.showvalue();//here it will overrride the base class A because we have not given any parameter to A
						//If i pass any parameter in A it will be passed to B class not to A class
						//As we have mentioned parameter in B only and not in A
	}
}
