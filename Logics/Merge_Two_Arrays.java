package code;

public class Merge_Two_Arrays {

	public static int counter = 0;
	public static int counter2 = 0;
	
	public static int[] mergedArray(int[]arrA,int[]arrB) {
		counter = arrA.length+arrB.length;
		int[] mergedArr = new int[counter];
		
		for(int i=0;i<=arrA.length-1;i++) {
			mergedArr[counter2] = arrA[i];
			counter2 = counter2+1;
		}
		
		for(int i=0;i<=arrB.length-1;i++) {
			mergedArr[counter2] = arrB[i];
			counter2 = counter2+1;
		}
		
		return mergedArr;
		
	}
	
	/*
	 * Author: Shubham Ashtaputre
	 */
	
	public static void main(String[] args) {
		
		int[] arrA = {1,2,3};
		int[] arrB = {4,5};
		
		int[] arrC = mergedArray(arrA,arrB);
		
		for(int i=0;i<=arrC.length-1;i++) {
			System.out.println(arrC[i]);
		}
		
	}

}
