package com.javaProgram.codingChallange;

import java.util.HashMap;
import java.util.Map;

public class NumberOfEachCharacterOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="To DO or Not to dO";
		
		getNumberOfEachCharactersFromString(str);

	}
	
	public static void getNumberOfEachCharactersFromString(String str)
	{
		str=str.toLowerCase();
		Map<Character,Integer>hMap=new HashMap<Character,Integer>();
		for(Character ch:str.toCharArray())
		{
			if(ch!=' ')
			{
			if(hMap.containsKey(ch))
			{
				hMap.put(ch, hMap.get(ch)+1);
			}
			else
			{
				hMap.put(ch, 1);
			}
			}
		}
		
		System.out.println("Printing Number of occurances of each String");
		for(Character ch:hMap.keySet())
		{
			System.out.println("Character "+ch+" appears for "+hMap.get(ch)+" times.");
		}
		
	}

}
