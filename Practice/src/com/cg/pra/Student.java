package com.cg.pra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student {
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	List<Student> list=new ArrayList<Student>(Arrays.asList(new Student(1,"Mohana"),new Student(2,"Priya"),new Student(3,"Dharshini")));
	
	List<Student>list1=list.stream().sorted().collect(Collectors.toList());
	//System.out.println(list1);
	list1.forEach(System.out::println);
}	
}

