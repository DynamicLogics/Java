package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//import java.util.*;


public class ObjectOutputStream_1
{


	public static void main(String[] args) throws IOException
	{
		BankApp b1 = new BankApp("SBI",20000);//passing value in constructor of Bank class
		
		String path = "C:/Users/cdac/Desktop/oxygen_Workspace/FileHandling/object.text";//file location
		
		File filename = new File(path);//creating object of file
		
		FileOutputStream fout = new FileOutputStream(filename);//writing data to that file
		
		ObjectOutputStream objout = new ObjectOutputStream (fout);//An ObjectOutputStream writes primitive data types and graphs of Java objects to an OutputStream. The objects can be read (reconstituted) using an ObjectInputStream. 
		
		objout.writeObject(b1);//here the encrypted file is being created at the output
		
		System.out.println("Object written to the File");
	}

}
