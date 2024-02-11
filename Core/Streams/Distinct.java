package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {

	/*
	 * Author: Shubham Ashtaputre
	 * Function Usage: If you want to remove duplicate data and see only unique set of data then
	 * 				   you can use distinct function
	 * 				 
	 * 
	 */
	
	public static void main(String[] args) {
		
		List<String> getNames = Constants.getUniqueValues();
		List<String> getUniqueNames;
		
		getUniqueNames = getNames.stream().distinct().collect(Collectors.toList());
		
		for (String uniqueName : getUniqueNames) {
			System.out.println(uniqueName);
		}
		
	}
	
}
