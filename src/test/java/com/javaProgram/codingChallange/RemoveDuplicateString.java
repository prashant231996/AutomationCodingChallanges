package com.javaProgram.codingChallange;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String array[]=new String[] {"prashant","prashant","more"};
		Set<String>hashSet=new HashSet<String>();
		for(String word:array)
		{
			hashSet.add(word);
		}
		System.out.println("Array after removing duplicate strings.");
		String resultArray[]=new String[hashSet.size()];
		int count=0;
		for(String word:hashSet)
		{
			resultArray[count]=word;
			count++;
		}
		for(String word:resultArray)
		{
			System.out.println(word);
		}
	}

}
