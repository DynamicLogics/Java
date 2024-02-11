package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayMatrix_to_ArrayListMatrix {

	public static void main(String[] args) {
		
		//Single Array
		Integer arrayMatrixA[] = {1,2,3,4,5,6,7,8,9};
		List<Integer> arrayListMatrixA = Arrays.stream(arrayMatrixA).collect(Collectors.toList());
		System.out.println(arrayListMatrixA);
		System.out.println("\n");
		
		//Matrix Arrays
		Integer[][] arrayMatrix = {{1,2,3},{4,5,6},{7,8,9}};
		List<List<Integer>> arrayListMatrix =
		Arrays.stream(arrayMatrix).map(Arrays::asList).collect(Collectors.toList());
		System.out.println(arrayListMatrix);
		//converting the matrix to single list and adding all values inside it
		arrayListMatrix.stream().flatMap(val->val.stream()).reduce((x,y)->x+y).ifPresent(x->System.out.println(x));
		
	}

}
