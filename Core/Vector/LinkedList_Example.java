package Vector_1;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Example
{

	public static void main(String[] args) 
	{
		//creating linked list object
		LinkedList <Student_class> l1 = new LinkedList <Student_class>();
		
		LinkedList <Student_class> l2 = new LinkedList <Student_class>();
		
		//creating student linked list for saving in linkedlist
		Student_class s1 = new 	Student_class ("John",1);//we are giving this values in class Student_class constructor
		Student_class s2 = new 	Student_class ("Smith",2);
		Student_class s3 = new 	Student_class ("Alex",3);
		Student_class s4 = new 	Student_class ("Sams",4);
		
		//adding object to linkedlist
		l1.add(s1);
		l1.add(s2);
		
		System.out.println("Content of list one");

		//printing content of the linked list
		Iterator<Student_class> iterator = l1.iterator();
		
		while(iterator.hasNext())//hasnext will givwe true it next value is present else no next element then it will give false
		{
			Student_class s = iterator.next();//next will give only one element output
			System.out.println("Name:"+s.getName());
			System.out.println("RollNo:"+s.getRollno());	
		}
		
		//adding elements to second linked list
				l2.add(s3);
				l2.add(s4);
		
		//adding second linked list to first linked list
				l1.addAll(l2);
				
		System.out.println("Content of list two");
	
		//printing content of the linked list
		Iterator<Student_class> iterator1 = l2.iterator();//iterator1 is object to Iterator class of which element<E>is<Student_class>
				
		while(iterator1.hasNext())
				{
					Student_class s = iterator1.next();
					System.out.println("Name:"+s.getName());
					System.out.println("RollNo:"+s.getRollno());	
				}
				
	
		 System.out.println("Pop element in the list:" + l1.pop());//poping of an element
		 
		 System.out.println("Remove element in the list:" + l1.remove(1));//remove of particuar 
			
	}

}
