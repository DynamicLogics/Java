package Threading_Example;

public class Printing_char_number implements Runnable
{
    Thread t1;
    
    public Printing_char_number(String threadname)
    {
    	t1 = new Thread(this,threadname);
    	t1.start();
    }

	public void run() 
	{
		for( char i ='a';i<='z';i++)
		{
			System.out.println("value of:"+t1.getName()+ i);
		try
		{
			t1.sleep(500);
		}
		catch(Exception e)
		{
			System.out.println("Error in implementing sleep");
		}
		
		}
		
		for(int j=0;j<10;j++)
		{
			System.out.println("Interger value"+t1.getName()+j);
			
			try
			{
				t1.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println("Error in implementing sleep");
			}
		}
		
	}
	
	public static void main(String args[])
	{
		Printing_char_number thread1 = new Printing_char_number("present char:");
		//Printing_char_number thread2 = new Printing_char_number("integer starts from:");
	}

}
