package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
/*
 * Interview question: whenever, two zeros occur in an array then replace 
 * rest of the array values with only 0 
 * 
 */
public class Code {
	
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
		
		/*
		 * Author: Shubham Ashtaputre
		 * Telegram Channel: Programming Illuminated
		 */
		
		/*Integer[] arr = {1,2,3,4};
		
		List<Integer> convertedList = Arrays.stream(arr).collect(Collectors.toList());
		
		for (Integer integer : convertedList) {
			System.out.println(integer);
		}*/
		
		
		
	}
	
}
