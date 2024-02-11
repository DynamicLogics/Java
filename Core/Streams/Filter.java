package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
	
	/*
	 * Author: Shubham Ashtpautre
	 * Function Usage: If you want to filter your data to get specific set of data then use this filter
	 * 				   method.
	 * 
	 */
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = Constants.getNumbers();
		List<Integer> filterOddNumber;
		ArrayList<Integer> filterEvenNumbers;
		
		//if you want to store filter value in array-list then you need to add cast as below
		filterEvenNumbers = (ArrayList<Integer>) numbers.stream().filter(x->x%2==0).collect(Collectors.toList());
		
		//if you don't want to add cast to your filter data then change the object type to list
		filterOddNumber = numbers.stream().filter(x->x%2!=0).collect(Collectors.toList());
		
		//printing the filtered values
		for (Integer integer : filterOddNumber) {
			System.out.println(integer);
		}
		
	}

}
