class largest
{
	public static void main(String args[])
	{
		int i;
		int a[]={10,20,30,40,50,60,70,80};
		for(i=7;i<a.length;i++)
		{
		//	System.out.println(a[i]);
		if(a[0]<a[i])
		{
			System.out.println("smallest number is: "+a[0]);
		}
		
		}
		
		for(i=7;i<a.length;i++)
		{
		//	System.out.println(a[i]);
		if(a[0]<a[i])
		{
			System.out.println("largest number is: "+a[i]);
		}
		
		}
	}
}