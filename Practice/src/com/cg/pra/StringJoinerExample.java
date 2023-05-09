package com.cg.pra;

import java.util.StringJoiner;  
public class StringJoinerExample {  
    public static void main(String[] args) {  
    
    StringJoiner arr=new StringJoiner(",","[","]");
    arr.add("Me");
    arr.add("I");
    arr.add("Myself");
    System.out.println(arr);
    
    
    }}