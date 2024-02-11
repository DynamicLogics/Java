class Constructor_1
{
	
		private int no1,no2;
		public Constructor_1()
		{
		    System.out.println("Inside constructor");
			no1=0;
			no2=0;
		}
		public Constructor_1(int n1,int n2)
		{
		    //System.out.println("Inside two parameterised constructor");
			no1=n1;
			no2=n2;
		}
		public Constructor_1(int n)//parameterised constructor
		{
			//System.out.println("Inside single parameterised constructor");
			no1=n;//here it is not necessary to use n only one time we can
			no2=n;//use n for both no1 & no2
		}
		public void setno1()
		{
			no1=0;
			//return 0;
		}
		public void setno2()
		{
			no2=0;
			//return 0;
		}	
		public int getno1()
		{
			return no1;
		}
		public int getno2()
		{
			return no2;
		}
}

class Constructor
{
	public static void main(String args[])
	{
		Constructor_1 n7=new Constructor_1();
		Constructor_1 n8=new Constructor_1(5,15);
		Constructor_1 n9=new Constructor_1(55);
		
		System.out.println("Number1: "+n8.getno1());
		System.out.println("Number1: "+n8.getno2());
	}
}