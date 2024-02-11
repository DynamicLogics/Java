/*
author : Shubham S Ashtaputre
date: 05/06/2021
license: open source
*/
package easy;

import java.math.BigInteger;
import java.util.Scanner;


public class FibonnaciAlgorithm {

//coursera's defined fibonacci algorithm
	public static int fib(int n) {
		if(n<=1) {
			return 1;
		}else{
			System.out.println(fib(n-1)+fib(n-2));
			return fib(n-1)+fib(n-2);
		}
	}
	
//Shubham's defined fibonacci algorithm
	private static BigInteger preNum  = new BigInteger("1");
	private static BigInteger newNum  = new BigInteger("0");
	private static BigInteger tempNum = new BigInteger("0");
	
	public static BigInteger fibAlgo(long n) {
		for(long i=0;i<=n;i++){
			if(i==0){
				newNum = new BigInteger("0");;
			}
			else if(i==1 || i==2) {
				newNum = preNum;
			}
			else{	
				tempNum = newNum.add(preNum); 
				newNum  = tempNum;
				preNum  = newNum.subtract(preNum);
			}
		}
		return tempNum;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter the Fibonnaci series number:\n");
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		BigInteger fibResult = fibAlgo(scn.nextLong());
		System.out.println("Result: "+fibResult);
		//System.out.println("Result: "+fib(4));
		
	}
}
