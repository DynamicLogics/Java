package code;

import java.util.ArrayList;
import java.util.List;

/*
 * Author: Shubham Ashtaputre
 */

public class WordOccurance {
	
	public static int counter = 0;
	public static String wordA = "";
	public static List<String> arr = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		String sen = " my name is shubham is my name ";
		
		for(int i=0;i<=sen.length()-1;i++) {
			if(sen.charAt(i)==' ') {
				if(wordA==" ") {
					continue;
				}else {
					arr.add(wordA);
				}
				wordA = "";
			}else {
				wordA = wordA+sen.charAt(i);
			}
		}
		
		for(int i=0;i<=arr.size()-1;i++) {
			for(int j=0;j<=arr.size()-1;j++) {
				if(arr.get(i).equals(arr.get(j))) {
					counter = counter+1;
					if(counter>1) {
						System.out.println(arr.get(j)+" "+counter);
					}
				}
			}
			counter = 0;
		}
		
	}

}
