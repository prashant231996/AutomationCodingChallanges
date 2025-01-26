package com.javaProgram.codingChallange;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12345;
		ReverseNumber.reverseNumber(num);
	}
	
	public static void reverseNumber(int number)
	{
		int rem=0;
		int rev=0;
		while(number!=0)
		{
			rem=number%10;
			rev=rev*10+rem;
			number=number/10;
		}
		System.out.println("Reversed number is "+rev);
	}

}
