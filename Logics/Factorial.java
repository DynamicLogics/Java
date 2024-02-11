/*
author : Shubham S Ashtaputre
date: 05/06/2021
license: open source
*/
package easy;

public class Factorial {

	
	public static int getFactorial(int val) {
		if(val<=0) {
			return 1;
		}else {
			int fact = getFactorial(val-1)*val;
			System.out.println("A: "+fact);
			return fact;
		}
	}
	
	public static void main(String[] args) {

		System.out.println(getFactorial(5));
		
	}

}
