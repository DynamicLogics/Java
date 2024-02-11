package Vector_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Student
{

	public static void main(String[] args) throws Exception
	{
		
		Student_class s1 = new 	Student_class ("a",1);//we are giving this values in class Student_class constructor
		Student_class s2 = new 	Student_class ("b",2);
		Student_class s3 = new 	Student_class ("c",3);
		Student_class s4 = new 	Student_class ("d",4);
		Student_class s5 = new 	Student_class ("e",5);
		Student_class s6 = new 	Student_class ("f",6);
		Student_class s7 = new 	Student_class ("g",7);
		
		
		Vector <Student_class> v1 = new Vector<Student_class>(3,2);//we are making vector object v1 of type Student_class
		
		v1.add(s1);
		v1.add(s2);
		v1.add(s3);
		v1.add(s4);
		v1.add(s5);
		v1.add(s6);
		v1.add(s7);
		
		System.out.println(v1);
		
		for(int i =0;i<v1.size();i++)
		{
			Student_class s = (Student_class) v1.get(i);
			System.out.println("Name:"+s.getName());
			System.out.println("RollNumber:"+s.getRollno());
		}
		
		String path = "C:\\Users\\cdac\\Desktop\\oxygen_Workspace\\Vector\\Student_Vector.txt";
		File filename = new File(path);//creating object of file
		FileOutputStream fout = new FileOutputStream(filename);//writing data to that file
		ObjectOutputStream objout = new ObjectOutputStream (fout);
		objout.writeObject(v1);
		
		
		
		           //creating object of file	
		 FileInputStream fin = new FileInputStream(filename);   //writing data to that file		 
		 ObjectInputStream objin = new ObjectInputStream (fin);
		 Vector v2 = (Vector) objin.readObject();
		
		 Student_class obj = (Student_class) v1.elementAt(5);// changing the name at particular postion in vector
		 obj.setChange("Rajendra");
		 
		for(int i =0;i<v2.size();i++)
		{
				Student_class s = (Student_class) v1.get(i);
				System.out.println("Name:"+s.getName());
				System.out.println("RollNumber:"+s.getRollno());
		}
		
		//printing using enumeration
		
		System.out.println("");
		Enumeration<Student_class> e1 = v2.elements();
		while(e1.hasMoreElements())
		{
			Student_class s = e1.nextElement();
			System.out.println("Name Enummeration:"+s.getName());
			System.out.println("RollNumber Enummeration:"+s.getRollno());
		}
		
		
		
	}

}
