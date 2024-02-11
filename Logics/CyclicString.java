package logics.code;

import java.util.ArrayList;
import java.util.Iterator;

public class CyclicString {

	public static void main(String[] args) {
		
		try {
			
			ArrayList<Character> charsA = new ArrayList<Character>();
			ArrayList<Character> charsB = new ArrayList<Character>();
			String cysString = "aba";
			int strLength =  cysString.length();
			//System.out.println("String Length:"+ strLength+"\n");
				if(strLength>=3 && strLength<=15) {
					for(int i=0;i<=strLength-1;i++) {
						Character charsA1 = cysString.charAt(i);
						System.out.println("Frwd: "+charsA1);
						charsA.add(charsA1);
					}
					for(int i=strLength-1;i>=0;i--) {
						Character charsB1 = cysString.charAt(i);
						System.out.println("Rwnd: "+charsB1);
						charsB.add(charsB1);
					}
			}
			
		    System.out.println(charsA.get(0) +" : "+ charsB.get(0) +" : "+ charsA.get(1) +" : "+ charsB.get(1));
			
			if(charsA.get(0) == charsB.get(0) & charsA.get(1) == charsB.get(1) || charsA.get(0) == charsB.get(0)) {
				
					System.out.println("Found:"+(charsA.size()-1));
				
			}else {
				
				System.out.println("Zero Found");
				
			}
				
				
		}catch(Exception e) {
			System.out.println("Error");
		}
		
		
	}
	
}