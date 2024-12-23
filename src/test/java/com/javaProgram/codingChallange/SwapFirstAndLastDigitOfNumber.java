package com.javaProgram.codingChallange;

public class SwapFirstAndLastDigitOfNumber {
	
	public static void main(String args[])
	{
		int num=12345;
	    int numUpd=reverseFirstAndLastDigit(num);
	    System.out.println("After reversing First And last character "+numUpd);
	}
	
	public static int reverseFirstAndLastDigit(int num)
	{
		//approch 1 convert it to string
		/*String str=String.valueOf(num);
		String desiredStr="";
		String temp=""+str.charAt(0);
		desiredStr=desiredStr+str.charAt(str.length()-1);
		for(int i=1;i<str.length()-1;i++)
		{
			desiredStr=desiredStr+str.charAt(i);
		}
		desiredStr=desiredStr+temp;
		return Integer.parseInt(desiredStr);*/
		
		//approch 2 without converting it to string
		int lastDigit=num%10;
		System.out.println("LastDigit "+lastDigit);
		int powerValue=(int)Math.log10(num);
		System.out.println("Power Value "+powerValue);
		int firstDigit=num/(int)Math.pow(10, powerValue);
		System.out.println("First Digit "+firstDigit);
		int num1=firstDigit*(int)Math.pow(10, powerValue);
		System.out.println("Number 1 "+num1);
		int num2=num%num1;
		System.out.println("Number 2 "+num2);
		num=num2/10;
		System.out.println("Number after removing first & last digit "+num);
		int desiredNumber=lastDigit*(int)Math.pow(10, powerValue)+num*10+firstDigit;
		return desiredNumber;
	}

}
