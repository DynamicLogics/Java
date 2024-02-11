/*
author : Shubham S Ashtaputre
date: 05/06/2021
license: open source
*/
package easy;

public class MaximumPairewiseProduct {

	public static int maximumPairewiseProduct(int[]arrayNumbers) {
		int i = 0;
		//sorting the array in ascending order
				while(i<=arrayNumbers.length){
					for(int k=0;k<=arrayNumbers.length-1;k++) {
							if(k==0){
								if(arrayNumbers[k]>arrayNumbers[k+1]){	
									int temp = arrayNumbers[k];
									arrayNumbers[k] = arrayNumbers[k+1];
									arrayNumbers[k+1] = temp;
						    }
						 }else if(k!=0) {
							 	if(arrayNumbers[k-1]>arrayNumbers[k]){
									 int temp = arrayNumbers[k-1];
									 arrayNumbers[k-1] = arrayNumbers[k];
									 arrayNumbers[k] = temp;
							 	}
						 }
					}
				   i+=1;
			 }
			//maximum pairwise product result
			int result = arrayNumbers[arrayNumbers.length-1]*arrayNumbers[arrayNumbers.length-2];
			return result;
	}
	
	
	public static void main(String[] args) {
		
		//array with random numbers declared in any order
		int[] arrayNumbers = {10,3,44,6,8,67,2,1,68,12,11,16,14,0,-1};
		int result = maximumPairewiseProduct(arrayNumbers);
		System.out.println("Result: "+result);
		
	}
}
