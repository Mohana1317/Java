package com.cg.pra;

import java.util.Arrays;
import java.util.List;

public class EvenNum {

public static void main(String[] args) {
	List<Integer> myList=Arrays.asList(1,12,3,45,44,6);
	//not even numbers
	//myList.stream().filter(n -> n%2 !=0).forEach(System.out::println);
	myList.stream().filter(n->n%2!=0).map(n->n*n*n).forEach(System.out::println);
}


}