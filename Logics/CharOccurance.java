package code;

import java.util.ArrayList;
import java.util.*;
import java.util.Arrays;

public class CharOccurance {

	public static char[] val;
	public static int counter = 0;
	public static HashMap<Character,Integer> uniqueValues = new HashMap<>();
	
	public static void main(String[] args) {
		
		String value = "Interview Discussion with - Shubham Ashtaputre";
		
		val = new char[value.length()];
		
		for(int i=0;i<=value.length()-1;i++) {
			val[i] = value.charAt(i);
		}
		
		for(int j=0;j<=value.length()-1;j++) {
			
			for(int k=0;k<=val.length-1;k++) {
				
				if(val[k]==value.charAt(j)) {
					counter+=1;
				}
				
			}
			uniqueValues.put(value.charAt(j), counter);
			counter=0;
		}
		
		System.out.println(uniqueValues);
		
	}

}
