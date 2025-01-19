package com.javaProgram.codingChallange;

public class CountTheNumberOfLetters_Numbers_And_Specialcharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Automat@123ion,";
		countNumberOfLettersNumbersAndSpecialCharacters(str);
	}
	
	public static void countNumberOfLettersNumbersAndSpecialCharacters(String str)
	{
		char[]charArray=str.toCharArray();
		int letterCount=0,numberCount=0,specialCharCount=0;
		for(Character ch:charArray)
		{
			if(Character.isLetter(ch))
			{
				letterCount++;
			}
			else if(Character.isDigit(ch))
			{
				numberCount++;
			}
			else 
			{
				specialCharCount++;
			}
		}
		System.out.println("Number of letters are: "+letterCount);
		System.out.println("Number of digits are: "+numberCount);
		System.out.println("Numeer of specialchracters: "+specialCharCount);
	}

}
