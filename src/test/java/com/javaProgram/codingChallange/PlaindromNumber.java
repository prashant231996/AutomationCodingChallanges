package com.javaProgram.codingChallange;

public class PlaindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=121;
		if(checkPalindrom(num))
			System.out.println("Number is palindrome");
		else
			System.out.println("Number is not palindrom");
	}
	
	public static boolean checkPalindrom(int num)
	{
		int temp=num;
		int rem,rev=0;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(temp==rev)
			return true;
		else
			return false;
	}

}
