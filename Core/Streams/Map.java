package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Map {

	/*
	 * Author: Shubham Ashtaputre
	 * Function Usage: Returns a stream consisting of the results of applying 
	 * 				   the given function to the elements of this stream.
	 * 
	 */
	
	public static void main(String[] args) {
		
		ArrayList<Integer> getNumbers = Constants.getNumbers();
		
		List<Integer> getSquareNumbers; 
		
		//using the map function to print the square root of a number
		getSquareNumbers = getNumbers.stream().map(x->x*x).collect(Collectors.toList());
		
		getSquareNumbers.stream().forEach(squareNumber->{
			System.out.println(squareNumber);
		});
		
	}

}
