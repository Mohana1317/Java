package com.cg.pra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LengthOfElements {
	public static void main(String[] args) {
		
		//find length of array which has more than 6 letters
	List<String> arr=new ArrayList<String>();
	arr.add("Priya");
	arr.add("Dharshini");
	arr.add("Mohana");
	long var=arr.stream().filter(str-> str.length()>6).count();
	System.out.println(var);
	
	}
	}