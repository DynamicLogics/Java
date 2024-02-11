package Vector_1;

import java.util.Vector;

public class First
{

	public static void main(String[] args)
	{
		Vector<String> v1 = new Vector<String>(5,2);//here 5 is initial capacity is 5 and can be incremented by 2
		System.out.println("Size of vector:"+v1.size());//here v1 is String object as vector needs object to operate
		String s1 = "Joe";
		v1.add(s1);
	
		String s2 = "John";
		String s3 = "Tim";
		String s4 = "Michael";
		String s5 = "Alice";
		
		v1.add(s2);// here we are adding the string in vector
		v1.add(s3);
		v1.add(s4);
		
		System.out.println("Size of vector:"+v1.size());
		System.out.println(v1);
		
		v1.add(2,s5);// adds a element at give index
		System.out.println("Inserted in between 2 index: "+v1);
		
		if(v1.contains(s2))// returns true if vector contains the given element
			System.out.println("Element Present");
		else
			System.out.println("Element Absent");

		String str = v1.elementAt(2);
		System.out.println("Inserted in between 2 index: "+str);

		
		
	}

}
