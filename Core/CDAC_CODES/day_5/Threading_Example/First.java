package Threading_Example;

public class First implements Runnable // runnable is interface
{
	Thread t1;

	public First(String threadname)
	{
		t1=new Thread(this,threadname);
		t1.start();// it will go to run method and run method will execute
	}

	public void run() 
	{
		System.out.println("Inside Run Thread...");
		System.out.println("Thread Name t1  "+t1.getName());//t1.getName() will pass value in constructor of First in main below
	}                                                      //to here 
	
	public static void main(String args[])
	{
		
		First thread1 = new First("First Thread...");//this argument  passed in above 
	}
}
