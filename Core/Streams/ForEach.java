package com.stream;

import java.util.List;
import java.util.stream.Collectors;

public class ForEach {

	/*
	 * Author: Shubham Ashtaputre
	 * Function Usage: If you want don't want to use for loop or foreach loop and want to display
	 * 				   collections data using stream then you can use forEach function of stream.
	 * 				 
	 * 
	 */
	
	public static void main(String[] args) {
		
		List<String> getNames = Constants.getUniqueValues();
		List<String> getUniqueNames;
		
		getNames.stream().distinct().collect(Collectors.toList()).
						 forEach((String values) -> 
						 	{System.out.println("Names: "+values);
						 });
		
	}

}
