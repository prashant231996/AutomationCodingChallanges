package com.javaProgram.codingChallange;

public class StringPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="anna";
		if(verifyStringPalindrom(str))
		{
			System.out.println("Given string is palindrom");
		}
		else
		{
			System.out.println("Given String is not palindromm");
		}

	}
	
	public static boolean verifyStringPalindrom(String str)
	{
		str=str.toLowerCase();
		StringBuilder builder=new StringBuilder(str);
		return builder.reverse().toString().equalsIgnoreCase(str);
		
	}

}
