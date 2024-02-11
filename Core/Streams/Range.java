package com.stream;

import java.util.stream.IntStream;

public class Range {

	public static void main(String[] args) {
		
		IntStream.range(1, 10).forEach(i->System.out.println(i+" "));
		
	}

}
