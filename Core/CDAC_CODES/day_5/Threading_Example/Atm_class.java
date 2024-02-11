package Threading_Example;

import java.util.Scanner;

//package Threading_Example;
public class Atm_class implements Runnable
{
	Thread t1;
	Bank_Application b;
	
	public Atm_class(String threadname,Bank_Application b)
	{
		t1 = new Thread(threadname);
		this.b = b;
		Scanner scan = new Scanner(System.in);
		t1.start();
	}
	public void run()
	
	{
		
		System.out.println("Enter the withdrawel amount:");
		b.withdraw(0);
		
		System.out.println("Enter the balance:");
		b.balance();
		
	}

}
