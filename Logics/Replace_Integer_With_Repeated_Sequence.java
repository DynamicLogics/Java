package code;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
/*
 * Author: Shubham Ashtaputre 
 * 
 * Interview question: whenever, two zeros occur in an array then replace 
 * rest of the array values with only 0 
 * 
 */
public class Replace_Integer_With_Repeated_Sequence {
	
	public static int counter = 0;
	public static int counter1 = 0;
	
	public static void main(String[] args) {
		
		ArrayList<Integer> obj = new ArrayList<Integer>();
		obj.add(1);
		obj.add(0);
		obj.add(2);
		obj.add(0);
		obj.add(0);
		obj.add(3);
		obj.add(4);
		
		for(int i=0;i<=obj.size()-1;i++) {
			counter = i;
			if((counter+1)<=obj.size()-1 && obj.get(i).equals(obj.get(counter+1))) {
				counter1 = counter+1;
				if((counter1+1)<=obj.size()-1)
					obj.set(counter1+1, 0);
				if((counter1+1)<=obj.size()-1)
					obj.set(counter1+1, 0);
			}counter1=0;
		}
		
		for(int i=0;i<=obj.size()-1;i++) {
			System.out.println(obj.get(i));
		}
		
	}

}
