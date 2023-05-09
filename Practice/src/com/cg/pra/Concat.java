package com.cg.pra;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Concat {
	public static void main(String[] args) {
		List<String> str1=Arrays.asList("Java","8");
		List<String> str2=Arrays.asList("Hello","World");
		Stream<String>con=Stream.concat(str1.stream(),str2.stream());
		con.forEach(n->System.out.print(n+ " "));
		
	}

}
