package com.javaProgram.codingChallange;

import java.util.HashSet;

public class RemoveDuplicatesfromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[]arrayList=new int [] {1,2,3,4,5,3,2};
        HashSet<Integer>arraySet=new HashSet<Integer>();
        for(int num:arrayList)
        {
        	arraySet.add(num);
        }
        System.out.println("Array after removing duplicates: ");
        for(int num:arraySet)
        {
        	System.out.print(num +"\t");
        }
	}

}
