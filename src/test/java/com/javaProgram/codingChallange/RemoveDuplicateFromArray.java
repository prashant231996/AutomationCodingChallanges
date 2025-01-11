package com.javaProgram.codingChallange;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]=new int[] {1,2,3,3,4,4,5};
	    Set<Integer>hashset=new HashSet<Integer>();
	    for(int num:array)
	    {
	    	hashset.add(num);
	    }
	    System.out.println("Removed duplicate element from array "+hashset);

	}

}
