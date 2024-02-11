package code;

import java.util.ArrayList;

/*
 * Author: Shubham Ashtaputre
 * Problem: Reverse each word occuring in an given string
 * Input = "This is my country"
 *Output = "ishT si ym yrtnuoc"
 */ 

public class Reverse_Words_Of_String {
	
	public static String revWord = "";
	public static String newWord = "";
	public static ArrayList<String> obj = new ArrayList<String>();
	
	public static void main(String[] args) {
		/*
		 * Input = "This is my country"
		 * Output = "sihT si ym yrtnuoc"
		 * 
		 */
		String val = "This is my country";
		for(int i=val.length()-1;i>=0;i--) {
			if(i==0) {
				revWord = revWord+val.charAt(i)+' ';
			}else {
				revWord = revWord+val.charAt(i);
			}
		}
		for(int i=0;i<=revWord.length()-1;i++) {
			if(revWord.charAt(i)==' ') {
				obj.add(newWord);
				obj.add(" ");
				newWord = "";
			}else {
				newWord = newWord+revWord.charAt(i);
			}
		}
		System.out.println("Input String: "+ val);
		System.out.print("Reversed Words: ");
		for(int i=obj.size()-1;i>=0;i--) {
			System.out.print(obj.get(i));
		}
		
	}
	
}
