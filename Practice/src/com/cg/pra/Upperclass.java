package com.cg.pra;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Upperclass {

	public static void main(String[] args) {
		List<String>list=Arrays.asList("india","America","Thailand","brazil");
		String moh=list.stream().map(x->x.toUpperCase()).collect(Collectors.joining(",","[","]"));
		System.out.println(moh);
		
	}
}
