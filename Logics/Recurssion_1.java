package logics.code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Recurssion_1 {
	
	//it will give stack overflow error
	public static int getValue(int i) {
		System.out.println("Value: "+i);
		return i+getValue(i-1);
	}
		
	public static void main(String[] args) {
			
			int val = getValue(5);
			System.out.println(val);
			
	}

}
