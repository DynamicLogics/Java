package concepts.codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Stream Theory:
 * 
 * Introduced in Java 8, the Stream API is used to process collections of objects. 
 * A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.
The features of Java stream are –

A stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels.
Streams don’t change the original data structure, they only provide the result as per the pipelined methods.
Each intermediate operation is lazily executed and returns a stream as a result, hence various intermediate 
operations can be pipelined. Terminal operations mark the end of the stream and return the result.
 * 
 * 
 * 
 */

public class StreamConcept {

	public static void main(String[] args) {
		
		//Square the integer number inside list
		List<Integer> singleNumber = Arrays.asList(2,3,4,5,6);
		
		//using stream to double the list content
		List<Integer> squareNumberList = singleNumber.stream().map(x->x*x).collect(Collectors.toList());
		//System.out.println(squareNumberList);
		
		//foreach loop using stream
	    singleNumber.stream().forEach(num->System.out.println(num));
	    
	    //filtering even number from list and adding them all
	    //here, ans is variable to which 0 value is assigned.
	    int evenNumber = singleNumber.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
	    System.out.println(evenNumber);
	    
		//Code the file Names form the list
		List<String> namesList = Arrays.asList("Tim","Hank","Sam","Henry");
		
		//using stream to filter the names starting with "H" character
		List<String> filteredNamesList = 
				namesList.stream().filter(s->s.startsWith("H")).collect(Collectors.toList());
		//System.out.println(filteredNamesList);
		
		//code to sort names
		List<String> sortedNamesList = namesList.stream().sorted().collect(Collectors.toList());
		//System.out.println(sortedNamesList);
		
	}

}
