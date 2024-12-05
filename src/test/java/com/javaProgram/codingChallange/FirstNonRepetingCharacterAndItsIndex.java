package com.javaProgram.codingChallange;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstNonRepetingCharacterAndItsIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="appll";
		List<Object>resultObject=new ArrayList<Object>();
		resultObject=getFirstNonRepeatingCharacterAndItsIndex(str);
		if(resultObject.size()==2)
		{
			System.out.println("First Non repeating character: "+resultObject.get(0));
			System.out.println("Index of first non repeating character: "+resultObject.get(1));
		}
		else 
		{
			System.out.println("Their is no non repeating character in string so returing "+resultObject.get(0));
		}
	}
		
	public static List<Object> getFirstNonRepeatingCharacterAndItsIndex(String str)
	  {
			str=str.toLowerCase();
			int i;
			List<Object>resultObject=new ArrayList<Object>();
			Map<Character,Integer>hMap=new HashMap<Character,Integer>();
			for(Character ch:str.toCharArray())
			{
				if(hMap.containsKey(ch))
				{
					hMap.put(ch, hMap.get(ch)+1);
				}
				else
				{
					hMap.put(ch,1);
				}
			}
			for(i=0;i<str.length();i++)
			{
				if(hMap.get(str.charAt(i))==1)
				{
					resultObject.add(str.charAt(i));
					resultObject.add(i);
					break;
				}
			}
			if(i==str.length())
			{
				resultObject.add(-1);
			}
			return resultObject;
	   }

	

}
