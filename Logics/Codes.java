package code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.xml.stream.events.Characters;

//Finding the total number of repeated characters in a given sentence

public class Codes {

	public static void main(String[] args) {
		
		String name = "Shubham Ashtaputre";
		
		Character[] chars = new Character[name.length()];
		
		for(int i=0;i<=name.length()-1;i++) {
			chars[i] = name.charAt(i);
		}
		
		
		Map<Character, Long> val = 
				Arrays.stream(chars).collect
				(Collectors.groupingBy(Function.identity(),Collectors.counting()));
			
		System.out.println(val);
		
		
		
	}

}
