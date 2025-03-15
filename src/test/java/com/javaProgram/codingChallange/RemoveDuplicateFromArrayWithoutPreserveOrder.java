package com.javaProgram.codingChallange;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicateFromArrayWithoutPreserveOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {5,6,7,3,3,7,5};
		HashSet<Integer>hashset=new HashSet<Integer>();
		ArrayList<Integer>arrayList=new ArrayList<Integer>();
		for(int num:arr)
		{
		  if(hashset.add(num))
		  {
			  arrayList.add(num);
		  }
		}
		System.out.println("After removing duplicate elements in SET "+hashset);
		System.out.println("After removing duplicate elements "+arrayList);
	}

}
