package com.cg.pra;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AscAndDesc {
	public static void main(String[] args) {
		List<Integer>my=Arrays.asList(-11,2,3,4,5,6,7,7,0);
		//Ascending Order
		//my.stream().sorted().forEach(System.out::println);
		
		//Descending order
		my.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
