package com.cg.pra;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StartingWith {
	public static <T> void main(String[] args) {
//		List<Integer> myList=Arrays.asList(12,43,57,16,29,11,1);
//		//Starting with 1 in ascending order
		
//		myList.stream().map(n ->n + " ").filter(n->n.startsWith("1")).sorted().forEach(System.out::println);
		
		//Starts with Letter P and Descending order
		
		List<String> myList=Arrays.asList("Mohana","Priya","Pra");
		myList.stream().map(n->n+" ").filter(n->n.startsWith("P")).sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
