package com.javaProgram.codingChallange;

import java.util.Locale;

public class CapitalFirstLetterOfEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="prashant shivaji more";
		capitalizeFirstWord(str);
	}
	
	public static void capitalizeFirstWord(String str)
	{
		String[]words=str.split(" ");
		String capitalizedString="";
		for(String word:words)
		{
			String updatedString="";
			char ch=word.charAt(0);
			updatedString=updatedString+ch;
			updatedString=updatedString.toUpperCase();
			capitalizedString=capitalizedString+updatedString+word.substring(1);
            capitalizedString=capitalizedString+" ";
		}
		System.out.println("Updated String is "+capitalizedString);
	}

}
