package com.javaProgram.codingChallange;

import java.util.ArrayList;
import java.util.List;

public class ShortestAndLongestStringInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] words = { "BMW", "RollsRoy", "TATA", "Mahindra" };
		 findShortestAndLongestStringInArray(words);
	}
	
	public static void findShortestAndLongestStringInArray(String words[])
	{
		String shortestString="",longestString="";
		List<String>list=new ArrayList<String>();
		for(String word:words)
		{
			list.add(word);
		}
		shortestString=list.get(0);
		longestString=list.get(0);
		for(int i=1;i<list.size();i++)
		{
			if(list.get(i).length()>longestString.length())
			{
				longestString=list.get(i);
			}
			if(list.get(i).length()<shortestString.length())
			{
				shortestString=list.get(i);
			}
		}
		System.out.println("Longest string from array is "+longestString);
		System.out.println("Shortest string from array is "+shortestString);
	}

}
