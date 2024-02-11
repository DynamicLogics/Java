package code;

import java.util.ArrayList;
import java.util.List;

/*
 * Author: Shubham Ashtaputre
 */
public class Replace_Repeated_Words {

	public static String newWord = "";
	public static List<Character> replaceChars = new ArrayList<Character>();
	public static Character refChar = ' ';
	
	public static void main(String[] args) {
		
		
		String name = "Uniaversal Boss";
		System.out.println("Original String: "+name);
		
		for(int i=0;i<=name.length()-1;i++) {
			replaceChars.add(name.charAt(i));
		}
		
		for(int i=0;i<=replaceChars.size()-1;i++) {
			refChar = replaceChars.get(i);
			for(int j=0;j<=replaceChars.size()-1;j++) {
				if(i!=j && refChar.equals(replaceChars.get(j))) {
					replaceChars.set(i, '_');
					replaceChars.set(j, '_');
				}
			}
		}
		
		for(int i=0;i<=replaceChars.size()-1;i++) {
			newWord = newWord+replaceChars.get(i);
		}
		
		System.out.println("Replaced Character:"+newWord);
		
	}

}
