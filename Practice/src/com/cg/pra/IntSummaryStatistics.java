package com.cg.pra;

import java.util.Arrays;
import java.util.List;
//import java.util.IntSummaryStatistics;


public class IntSummaryStatistics {
	public static void main(String[] args) {
		List<Integer> my=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		java.util.IntSummaryStatistics pri=my.stream().mapToInt((x)-> x) .summaryStatistics();
		System.out.println(pri);
	
	//	List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29); 
		
	
	
	}

}
