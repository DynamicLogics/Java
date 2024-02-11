package com.pratice.codes;
		
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
		
public class Permutation {
	
	public static String temp = "";
	public static String mna = "";
	public static String mnb = "";
	public static int Of = 0;
	public static ArrayList<String> val = new ArrayList<String>();
	
	public static void main(String[] args) {
		//String charSeq = "ABCD";
		//Character[] strArr = new Character[charSeq.length()-1]; 
		String[] charSeq = {"A","B","C","D"};
		
		
		for(int i=0;i<=charSeq.length-1;i++) {
			mna = charSeq[i];
			for(int j=0;j<=(charSeq.length-1*2);j++) {
				for(int k=0;k<=charSeq.length-1;k++) {
					if(k!=i && k+1<=charSeq.length-1) {
						temp = charSeq[k];
						charSeq[k] = charSeq[k+1];
						charSeq[k+1] = temp;
					}
					
					for(int m=0;m<=charSeq.length-1;m++) {
						System.out.print(charSeq[m]);
					}val.add(mnb);
					System.out.println("\n");
					
				}
				
			}
		
		}

	}	
		
}		
		