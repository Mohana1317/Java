package com.cg.pra;

import java.util.Arrays;
import java.util.List;

public class FirstElement {
	public static void main(String[] args) {
//		List<Integer>my=Arrays.asList(11,2,3,4,5,6,7,7,0);
//		// Find the first element in array
//		my.stream().findFirst().ifPresent(System.out::println);
//	}
		List<Integer>my=Arrays.asList(-11,2,3,4,5,6,7,7,0);
		
		// Find the minimum value in the list
		Integer var=my.stream().min(Integer::compare).get();
		System.out.println(var);
	}
}
