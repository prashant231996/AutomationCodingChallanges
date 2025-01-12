package com.javaProgram.codingChallange;

public class RevereseOnlyVowelsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello world";
		reverseVowels(str);

	}
	
	public static void reverseVowels(String str)
	{
		str=str.toLowerCase();
		String vowels="";
		int j=0;
		char charArray[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(isVowel(str.charAt(i)))
			{
				vowels=vowels+str.charAt(i);
				j++;
			}
		}
		
		for(int i=0;i<charArray.length;i++)
		{
			if(isVowel(charArray[i]))
			{
				charArray[i]=vowels.charAt(--j);
			}
		}
		System.out.println("String with reversed vowels value is "+String.valueOf(charArray));
	}
	
	public static boolean isVowel(char ch)
	{
		return (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u');
	}

}
