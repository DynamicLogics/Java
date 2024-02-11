/*
author : Shubham S Ashtaputre
date: 05/06/2021
license: open source
*/
package easy;

public class GCDAlgorithm {
	
	public static int gcd(int a,int b) {
		int numA = 1;
		int numB = 1;
		
		while(numA<=a) {
			if(a%numA==0) {
				System.out.println("A: "+numA);
			}
			numA+=1;
		}
		
		while(numB<=b) {
			if(b%numB==0) {
				System.out.println("B: "+numB);
			}		
			numB+=1;
		}
		return b;
	}
	
	public static void main(String[] args) {
		
		int gcdNumber = gcd(21,49);
		System.out.println("GCD Number: "+gcdNumber);
		
	}

}

 