package com.javaProgram.codingChallange;

import java.util.HashSet;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Prashant";
		removeDuplicateFromString(str);
	}
	
	public static void removeDuplicateFromString(String str)
	{
		str=str.toLowerCase();
		HashSet<Character>hashSet=new HashSet<Character>();
		for(char ch:str.toCharArray())
		{
			hashSet.add(ch);
		}
		String result="";
		for(char ch:hashSet)
		{
			result=result+ch;
		}
		System.out.println("After removing characters from string is "+result);
	}

}
