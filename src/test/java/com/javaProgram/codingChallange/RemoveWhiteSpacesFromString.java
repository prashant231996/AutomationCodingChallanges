package com.javaProgram.codingChallange;

public class RemoveWhiteSpacesFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Auto mat ion";
		removeAllWhiteSpaces(str);
	}
	
	public static void removeAllWhiteSpaces(String str)
	{
		str=str.replaceAll("\\s+", "");
		System.out.println("Updated string after removing all white spaces :"+str);
	}

}
