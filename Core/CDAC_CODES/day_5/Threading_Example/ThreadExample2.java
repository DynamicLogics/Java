package Threading_Example;

public class ThreadExample2 implements Runnable
{
	Thread t1;

	public ThreadExample2 (String threadname)
	{
		t1=new Thread ( this,threadname);
		t1.start();
	}



	public void run() 
	{
		System.out.println("Thread Name t1"+t1.getName());
		for(int i=0;i<10;i++)
		{
			System.out.println("value of thread:"+t1.getName()+"is "+i);//getName will print the current thread name
		try
		{
			t1.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		}
	}
	
	public static void main(String args[])
	{
		ThreadExample2 thread1 = new ThreadExample2(" i:");
	}
}
