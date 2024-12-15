package com.javaProgram.codingChallange;

import java.util.HashMap;
import java.util.Map;

public class MaximumAndMinimumOccuranceInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Jyoti";
		getMaximumAndMinimunCharacter(str);
	}
	
	public static void getMaximumAndMinimunCharacter(String str)
	{
		str=str.toLowerCase();
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
		int min=99,max=0;
		char minChar=' ';
		char maxChar=' ';
		for(Character ch:hmap.keySet())
		{
			if(hmap.get(ch)>max)
			{
				max=hmap.get(ch);
				maxChar=ch;
			}
			
			if(hmap.get(ch)<min)
			{
				min=hmap.get(ch);
				minChar=ch;
			}
		}
		
		String minCharStr="";
		minCharStr=minCharStr+minChar;
		
		if(min==max)
		{
			System.out.println("No reapeting charcetr in given string");
		}
		else
		{
		System.out.println("Character which is occuring minimum times: "+minChar+"Occurance is :"+min);
		System.out.println("Character which is occuring maximum times: "+maxChar+"Occurance is :"+max);
		}
	}

}
