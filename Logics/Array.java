package code;
/*
 * Author: Shubham Ashtaputre
 */
public class Array {

	public static void main(String[] args) {
		
		//first way of declaring arrays
		int arr[] = {1,2,3,4};
		
		for(int val=0;val<=arr.length-1;val++) {
			System.out.println(arr[val]);
		}
		
		//second way of declaring arrays
		int[] fixedArr = new int[4];
		fixedArr[0] = 10;
		fixedArr[1] = 20;
		fixedArr[2] = 30;
		fixedArr[3] = 40;
		
		for(int val=0;val<=arr.length-1;val++) {
			System.out.println(fixedArr[val]);
		}
		
	}

}
