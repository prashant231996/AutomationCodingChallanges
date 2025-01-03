package com.javaProgram.codingChallange;

public class SwappingTwoStringsWithoughtThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="Prashant";
		String str2="More";
		System.out.println("Before swapping str1 is "+str1);
		System.out.println("Before swapping str2 is "+str2);
		//Appending both the strings in first string
		str1=str1+str2;
		//Storing first string value in second string
		str2=str1.substring(0,str1.length()-str2.length());
		//Storing second string value in first string
		str1=str1.substring(str2.length());
		System.out.println("After swapping str1 is "+str1);
		System.out.println("After swapping str2 is "+str2);
	}

}
