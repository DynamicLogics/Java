package code;
/*
 * Author: Shubham Ashtaputre
 */
public class ReverseStringWords {
	
	public static String reverseString = " ";
	public static String forwardString = " ";
	public static int counter = 1;
	public static Integer lengthTrack = 0;
	
	
	
	public static String reverseChars(String val) {
		lengthTrack = (val.length()-counter);
		if(lengthTrack<0) {
			reverseString = reverseString+" ";
			counter=1;
			return null;
		}else {
			reverseString += String.valueOf(val.charAt(lengthTrack));
			counter+=1;
			reverseChars(val);
		}
		return reverseString;
	}
	
	public static void main(String[]args) {
		
		String val = "my name is shubham ashtaputre ";
		
		for(int i=0;i<=val.length()-1;i++) {
			if(val.charAt(i)!=' ') {
				forwardString += String.valueOf(val.charAt(i));
			}else {
				reverseChars(forwardString);
				forwardString=" ";
			}
		}
		
		System.out.println("Final String: "+reverseString);
		
		
		/*String name = "Shubham";
		name = "Orange";
		System.out.println(name);*/
		
	}
	
}
