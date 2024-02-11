/*
author : Shubham S Ashtaputre
date: 05/06/2021
license: open source
*/
package easy;
public class ArraySorter {
	public static void main(String[] args) {
		int i = 0;
		//array with random numbers declared in any order
		int[] arrayNumbers = {3,10,44,6,8,99,2,1,68,12,-2,11,16,14,0,-1};
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
	//Getting the sorted array output	
	for(int j=0;j<=arrayNumbers.length-1;j++) {
		System.out.println(arrayNumbers[j]);
	   }
    }
}

