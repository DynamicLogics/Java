
package Threading_Example;

import java.util.*;

public class User_input_character implements Runnable
{
	Thread t1;
	
	public User_input_character(String threadmessage)
	{
		t1 = new Thread(this,threadmessage);
		t1.run();
	}


	public void run()
	{
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter the character:");
		char a = scan.next().charAt(0);
		
		for(char i =a;i<='z';i++)
		{
			System.out.println("character is:"+i+t1.getName());
		
		try
		{
				t1.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println("Error....");
		}
		}
	}
	
	public static void main(String args[])
	{
		User_input_character thr1 = new User_input_character(".");
	}
}
