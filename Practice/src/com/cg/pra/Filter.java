package com.cg.pra;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Filter {
	public static void main(String[] args) {
		List<String> moh=Arrays.asList("Bangalore","Chennai","Trichy","Karur");
		System.out.println("Printing Length greater than 5");
		moh.stream().filter(str->str.length()>5).forEach(System.out::println);
		System.out.println("Printing Each City");
		moh.stream().distinct().forEach(System.out::println);
		System.out.println("Printing first two cities in ascendind order");
		moh.stream().sorted().limit(2).forEach(System.out::println);
		System.out.println("Printing in Descending Order");
		moh.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println("Skipped Elements");
		moh.stream().skip(2).forEach(System.out::println);
		System.out.println("Count of elements");
		long var=moh.stream().count();
		System.out.println(var);
	
	}

}
