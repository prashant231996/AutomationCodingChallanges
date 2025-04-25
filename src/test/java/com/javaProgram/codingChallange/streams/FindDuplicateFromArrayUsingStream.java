package com.javaProgram.codingChallange.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FindDuplicateFromArrayUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Case 1
		List<String> ints = Arrays.asList("prem", "chand", "prem", "ooos", "ooos");

	    //using set
	    Set<String> setUniques = new HashSet<>();
	    Set<String> setDups = ints.stream().filter(s -> !setUniques.add(s))
	        .collect(Collectors.toSet());
	    System.out.println("using set: " + setDups);
	    
	    List<Integer>numbers=Arrays.asList(1,2,3,4,1,2);
	    
	    Set<Integer>setUnique=new HashSet<>();
	    Set<Integer>setDuplicate=new HashSet<>();
	    
	    setDuplicate=numbers.stream().filter(num->!(setUnique.add(num))).collect(Collectors.toSet());
        System.out.println("Duplicate numbers are "+setDuplicate);
	}

}
