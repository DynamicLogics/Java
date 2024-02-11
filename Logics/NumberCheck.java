package code;

import java.util.Arrays;
import java.util.List;
/*
	Author: Shubham Ashtaputre
	Telegram: Programming Illuminated
*/
public class NumberCheck {
	
	public static void main(String[] args) {
		/*Author: Shubham Ashtaputre
		 *Telegram Group: Java 🔥 Discussion Forum
		 */
		int matchNumber = 17;
		int[] arr = {1,10,3,7,4};
		int count = arr.length*arr.length;
		int val = arr.length;
		int counter = 1;
		for(int i=0;i<=(arr.length*arr.length)-1;i++) {
			if(val==count) {
				counter=counter+1;
			}else if(arr[counter]+arr[i]==matchNumber) {
				System.out.println("value found at "+arr[counter]+"+"+arr[i]);
				break;
			}
		}
		
	}
}
