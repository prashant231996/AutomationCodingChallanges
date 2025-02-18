package com.javaProgram.codingChallange;

import java.util.HashMap;

public class CompressString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aaabbccca";
		compressString(str);
	}
	
	public static void compressString(String str)
	{
		str=str.toLowerCase();
		HashMap<Character,Integer>hmap=new HashMap<Character, Integer>();
		String result="";
		for(char ch:str.toCharArray())
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
		for(char ch:hmap.keySet())
		{
			result=result+hmap.get(ch)+ch;
		}
		System.out.println("Compressed string is "+result);
	}

}
