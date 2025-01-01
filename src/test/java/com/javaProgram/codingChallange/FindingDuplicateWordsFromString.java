package com.javaProgram.codingChallange;

import java.util.HashMap;

public class FindingDuplicateWordsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		String str="Prashant Jyoti Jyoti";
		findDuplicateWordsFromString(str);
	}
	
	public static void findDuplicateWordsFromString(String str)
	{
		str=str.toLowerCase();
		String[]words=str.split(" ");
		HashMap<String,Integer>map=new HashMap<String,Integer>();
		for(String word:words)
		{
			if(map.containsKey(word))
			{
				map.put(word,map.get(word)+1);
			}
			else
			{
				map.put(word,1);
			}
		}
		
		for(String key:map.keySet())
		{
			if(map.get(key)>1)
			{
				System.out.println("Word "+key+" appers "+map.get(key)+" times.");
			}
		}
	}

}
