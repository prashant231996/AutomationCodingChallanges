package com.javaProgram.codingChallange;

import java.util.Arrays;

public class AnagramStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="silent";
		String str2="listen";
		boolean isAnagram=checkAnagram(str1,str2);
		if(isAnagram)
		{
			System.out.println("Strings are anagram");
		}
		else
		{
			System.out.println("Strings are not anagram.");
		}
	}
	
	public static boolean checkAnagram(String str1,String str2)
	{
		if(str1.length()!=str2.length())
		{
			return false;
		}
		char char1[]=str1.toCharArray();
		char char2[]=str2.toCharArray();
		//Sort the array
		Arrays.sort(char1);
		Arrays.sort(char2);
		for(int i=0;i<char1.length;i++)
		{
			if(char1[i]!=char2[i])
			{
				return false;
			}
		}
		return true;
	}

}
