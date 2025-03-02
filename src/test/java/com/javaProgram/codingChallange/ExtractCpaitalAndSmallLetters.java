package com.javaProgram.codingChallange;

public class ExtractCpaitalAndSmallLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aAssjdjFARWEU";
		extractCapitalAndSmallLetters(str);
	}
	
	public static void extractCapitalAndSmallLetters(String str)
	{
		StringBuilder capitalString=new StringBuilder();
		StringBuilder smallLetterString=new StringBuilder();
		for(Character ch:str.toCharArray())
		{
			if(Character.isUpperCase(ch))
			{
			  capitalString.append(ch);
			}
			if(Character.isLowerCase(ch))
			{
				smallLetterString.append(ch);
			}
		}
		System.out.println("String contains capital letter is "+capitalString);
		System.out.println("String conatians small letter is "+smallLetterString);
	}

}
