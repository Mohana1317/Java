package com.cg.pra;

import java.util.Arrays;
import java.util.List;

public class Minvalue {
public static void main(String[] args) {
	List<Integer>my=Arrays.asList(-11,2,3,4,5,6,7,7,0);
	//Minimum value
//	long var=my.stream().min(Integer::compare).get();
//	System.out.println(var);


//Maximun value
	long var=my.stream().max(Integer::compare).get();
	System.out.println(var);
}
}