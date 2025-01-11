package com.javaProgram.codingChallange;

public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=5;
		factorialOfNumber(num);
	}
	
	public static void factorialOfNumber(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of number is "+fact);
	}

}
