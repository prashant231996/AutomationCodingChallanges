package com.javaProgram.codingChallange;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostFrequentCharacterFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Prashant";
		List<Object>resultList=mostFrequentCharacter(str);
		System.out.println("Most frequent character is "+resultList.get(1)+" appers for "+resultList.get(0)+"times.");
	}
	
	public static List<Object> mostFrequentCharacter(String str)
	{
		str=str.toLowerCase();
		int maxCount=0;
		char character = 0;
		Map<Character,Integer>hmap=new HashMap<Character,Integer>();
		for(Character ch:str.toCharArray())
		{
			if(hmap.containsKey(ch))
			{
				hmap.put(ch, hmap.get(ch)+1);
			}
			else
			{
				hmap.put(ch, 1);
			}
		}
		
		for(Character cha:hmap.keySet())
		{
			if(hmap.get(cha)>maxCount)
			{
				maxCount=hmap.get(cha);
				character=cha;
			}
		}
		List<Object>resultList=new ArrayList<Object>();
		resultList.add(maxCount);
		resultList.add(character);
		return resultList;
	}

}
