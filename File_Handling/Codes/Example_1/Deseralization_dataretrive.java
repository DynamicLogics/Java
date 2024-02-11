package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class Deseralization_dataretrive
{

	public static void main(String[] args) 
	{
		File filename = null;//we are doing so to use it in finally down
		FileInputStream fin = null;
		ObjectInputStream objin;
		BankApp b1 = null;
		
		try
		{
			
			String path = "C:/Users/cdac/Desktop/oxygen_Workspace/FileHandling/object.text";//file location		
			
			 filename = new File(path);             //creating object of file	
			 fin = new FileInputStream(filename);   //writing data to that file	
			 
			 
			 objin = new ObjectInputStream(fin);	
			 
			 
			 b1 = (BankApp) objin.readObject();       //typecasting(Bank) to use character 		
			
			 System.out.println("Bank Name:"+b1.getName());
			System.out.println("Amount:"+b1.getAmount());
		
		}
		catch(Exception e)
		{
			System.out.println("Error"+e);
		}
		
		finally
		{
			try
			{
				//objin.close();
				fin.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}

	}

}
