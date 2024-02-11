package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Repeated_Character_Occurances {

	public static void main(String[] args) {
		
		String value = "My name is Shubham, and I'am from India";
		
		Character[] val = new Character[value.length()];
		
		for(int i=0;i<=value.length()-1;i++) {
			val[i] = value.charAt(i);
		}
		
		Map<Character, Long> characs = 
		Arrays.stream(val).
		collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(characs);

	}

}
