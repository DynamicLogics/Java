/*
author : Shubham S Ashtaputre
*/
package code;

import java.util.ArrayList;
import java.util.HashMap;

public class Two_Sum {

	/*Author: Shubham Ashtaputre
	 *Telegram Group: Java 🔥 Discussion Forum
	 */
	public static int[] twoSumWC(int[]arrOfNumbers,int targetValue) {
		int val=0;
		for(int i=0;i<=arrOfNumbers.length-1;i++) {
			for(int j=0;j<=arrOfNumbers.length-1;j++) {
				if(i!=j) {
					int requiredSum = arrOfNumbers[i]+arrOfNumbers[j];
					if(requiredSum==targetValue & val==0) {
						val++;
						return new int[] {i,j};
					}
			    }
			}
		}
		return null;
	}

	public static int globalArrcounter = 0;
	public static ArrayList<String> storeIndexNumbers = new ArrayList<String>();
	public static int counter = 0;
	/*Author: Shubham Ashtaputre
	 *Telegram Group: Java 🔥 Discussion Forum
	 */
	public static ArrayList<String> twoSumBC(int[]arrOfNumbers,int targetValue, int index, int arr) {
		if(globalArrcounter<=(arrOfNumbers.length*arrOfNumbers.length)+1) {
			globalArrcounter=globalArrcounter+1;
			if(arr<=arrOfNumbers.length-1) {
				if(index!=counter && arrOfNumbers[index]+arrOfNumbers[counter]==targetValue) {
					storeIndexNumbers.add(String.valueOf(index+" : "+counter));
				}
				counter=counter+1;
				twoSumBC(arrOfNumbers,targetValue,index,counter);
			}else {
				index = index+1;
				globalArrcounter=globalArrcounter+1;
				counter=0;
				twoSumBC(arrOfNumbers,targetValue,index,counter);
			}
		}
		return storeIndexNumbers;
	}
	
	public static void main(String[] args) {
		
		int[]arr = {2,7,11,15,6};
		
		int targetValue = 26;
		
		System.out.println("Best Case result for index numbers required -> "+twoSumBC(arr,targetValue,0,0).get(0));
		
		twoSumBC(arr,targetValue,0,0);
		
		System.out.println("Worst Case result for index numbers required -> "+twoSumWC(arr,targetValue)[0]+" : "
		+twoSumWC(arr,targetValue)[1]);
	
	}

}
