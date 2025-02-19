package com.javaProgram.codingChallange;

import java.util.ArrayList;
import java.util.List;

public class ReverseBigWordFromString {
	
	
	public static void main(String args[])
	{
	String str="reverse the big word only";
	reverseOnlyBigWord(str);
	}
	
	public static void reverseOnlyBigWord(String str)
	{
		String result="";
		String longestString="";
		String[]words=str.split(" ");
		List<String>list=new ArrayList<String>();
		for(String word:words)
		{
			if(word.length()>longestString.length())
			{
				longestString=word;
			}
			list.add(word);
		}
		for(String word:list)
		{
			if(word.equalsIgnoreCase(longestString))
			{
				StringBuilder builder=new StringBuilder(word);
				result=result+builder.reverse().toString();
			}
			else
			{
				result=result+word;
			}
			result=result+" ";
		}
		System.out.println("Resultant string is "+result);
		
	}
}


