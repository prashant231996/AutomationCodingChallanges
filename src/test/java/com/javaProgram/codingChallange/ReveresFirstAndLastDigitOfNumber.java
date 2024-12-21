package com.javaProgram.codingChallange;

public class ReveresFirstAndLastDigitOfNumber {
	
	public static void main(String args[])
	{
		int num=12345;
	    int numUpd=reverseFirstAndLastDigit(num);
	    System.out.println("After reversing First And last character "+numUpd);
	}
	
	public static int reverseFirstAndLastDigit(int num)
	{
		//approch 1 convert it to string
		String str=String.valueOf(num);
		String desiredStr="";
		String temp=""+str.charAt(0);
		desiredStr=desiredStr+str.charAt(str.length()-1);
		for(int i=1;i<str.length()-1;i++)
		{
			desiredStr=desiredStr+str.charAt(i);
		}
		desiredStr=desiredStr+temp;
		return Integer.parseInt(desiredStr);
		
		//approch 2 without converting it to string
		
		
		
	}

}
