package code;

import java.util.ArrayList;

public class Count_the_number_of_vowels_occurring {
	
	public static ArrayList<ArrayList<String>> multiDimArr = new ArrayList<ArrayList<String>>(); 
	public static ArrayList<String> vovls = new ArrayList<String>();
	public static int indexShift = 0;
	public static int index = 0;
	public static int counter = 0;
	public static int size = 0;
	public static int sub = 1;
	public static String newString = " ";
	public static String singleStringChar = " ";
	
	public static String getChars(ArrayList<String> word, int index) {
		singleStringChar = word.get(index);
		return singleStringChar;
	}
	
	public static ArrayList<ArrayList<String>> vovelFinder(ArrayList<String> word) throws InterruptedException {
		Thread.sleep(500);
		
		return multiDimArr;
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		String vals = "abcde";
		
		for(int i=0;i<=vals.length()-1;i++) {
			vovls.add(String.valueOf(vals.charAt(i)));
		}
		
		ArrayList<ArrayList<String>> finalVal = vovelFinder(vovls);
		
	}

}
