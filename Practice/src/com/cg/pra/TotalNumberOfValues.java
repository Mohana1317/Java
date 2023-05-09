package com.cg.pra;

import java.util.Arrays;
import java.util.List;

public class TotalNumberOfValues {
public static void main(String[] args) {
	List<Integer>my=Arrays.asList(-11,2,3,4,5,6,7,7,0);
	// Count the number of elements
//	long var=my.stream().count();
//	System.out.println(var);
	
	//Count the number of elements starting with 7
	long var=my.stream().map(n->n+ " ").filter(n->n.startsWith("7")).count();
	System.out.println(var);
}

}
