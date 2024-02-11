package com.stream;

import java.util.ArrayList;
import java.util.List;

public class Reduce {

	public static void main(String[] args) {
		
		List<Integer> num = new ArrayList<Integer>();
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(6);
		
		num.stream().reduce((x,y)->x+y).ifPresent(s->System.out.println(s));

	}

}
