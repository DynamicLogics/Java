package concepts.codes;

public class Recurssion {
	
	public static int getFactorial(int num) {
		if(num==0) {
			return 1;
		}else {
			int num1 = num*getFactorial(num-1);
			return num1;
		}
	}
	
	public static void main(String[] args) {
		Recurssion rcr = new Recurssion();
		System.out.println(rcr.getFactorial(5));
	}
	
}
