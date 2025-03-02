package com.javaProgram.codingChallange;

public class PrintEachLetterTwiceFromGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="hello";
		str=DoubleEachCharacterFromString(str);
		System.out.println("Result string is "+str);
	}
	
	public static String DoubleEachCharacterFromString(String str)
	{
		StringBuilder builder=new StringBuilder();
		for(char ch:str.toCharArray())
		{
			builder.append(ch).append(ch);
		}
		return builder.toString();
	}

}
