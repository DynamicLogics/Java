package code;

import java.util.ArrayList;

public class UniqueValues {

	public static int temp = 0;
	public static int lenght = 0;
	public static int counter = 0;
	public static int[] uniqArr = {};
	
	public static void main(String[] args) {
		
		int[] val = {1,2,1,3,2,4};
		int lenght = 5;
		
		for(int i=0;i<=35;i++) {
			if(counter<=lenght && (counter+1)<=lenght) {
				if(val[counter]>val[counter+1]) {
					temp = val[counter];
					val[counter] = val[counter+1];
					val[counter+1] = temp;
				}counter=counter+1;
			}else {
				counter=0;
			}
	    }
		
		for(int m=0;m<=5;m++) {
			if(m<=5 && (m+1)<=5) {
				if(val[m]!=val[m+1]) {
					System.out.println(val[m]);
				}
			}else {
				if((m+1)==5) {
					System.out.println(val[m]);
				}
			}
		}
		
		
		
}

}