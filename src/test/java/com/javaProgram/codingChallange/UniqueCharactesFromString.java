package com.javaProgram.codingChallange;

public class UniqueCharactesFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Java Automation";
		printUniqueCharactes(str);
	}
	
	public static void printUniqueCharactes(String str)
	{
		System.out.println("Unique charactes from string is ");
	    //Assumes ASCII charactes (0-127), use boolean array to track character occurrences
		boolean chars[]=new boolean[128];
		for(char ch:str.toCharArray())
		{
			if(!chars[ch] && ch!=' ')
			{
				chars[ch]=true;
				System.out.print(ch+" ");
			}
		}
	}

}
