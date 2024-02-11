package logics.code;

public class Palindrom {

	/*
		Find it the given number is palindrom without using loop or inbuilt function
	*/
	
	public static int start = 0;
	public static int end = 0;
	public static int middleNumber = 0;
	public static boolean verifier = false;
	public static int stopper = 0;
	
	
	public static boolean getPalindromValidation(String number,int midNumber,int length) {
		
		
		if(number.charAt(midNumber)==number.charAt(length)) {
			System.out.println("Middle Value: "+number.charAt(start)+" : "+number.charAt(end));
		}else {
			start+=1;
			end = length-1;
			System.out.println("Start: "+start+" : "+"End: "+end);
			if(number.charAt(start)==number.charAt(end) & stopper==0) {
				boolean val = getPalindromValidation(number,midNumber,end);
				verifier = true;
				System.out.println("Values Matched: "+number.charAt(start)+" : "+number.charAt(end)+" : "+stopper+" : "+verifier);
				return verifier;
			}else {
				stopper+=1;
				verifier = false;
				System.out.println("Values Not Matched"+" : "+stopper+" : "+verifier);
				return verifier;
			}
		}
		return false;
	}
		
	
	public static void main(String[] args) {
		
		int num = 123421;
		String num2 = String.valueOf(num);
		//getting middle number out of given number string
		middleNumber = (num2.length()+1)/2;
		//System.out.println(middleNumber);
		if(getPalindromValidation(num2,middleNumber-1,num2.length()-1)==true){
			System.out.println("Given Number Is Palindrom");
		}else {
			System.out.println("Given Number Is Not Palindrom");
		}
		
	}

}
