package com.javaProgram.codingChallange;

public class LargestNumberOfThreeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=1,b=2,c=3;
		
		largestOfNumbers(a,b,c);

	}
	
	public static void largestOfNumbers(int num1,int num2,int num3)
	{
		int max;
		max=num1>num2?num1:num2;
		max=max>num3?max:num3;
		System.out.println("Maximum number of given number is "+max);
	}

}
