package com.javaProgram.codingChallange;

public class FabonacciSequenceForFirstNNum {
	
	public static void main(String args[])
	{
	
	int N=10;
	
	fabonacciOfNnumber(N);
	}
	
	public static void fabonacciOfNnumber(int num)
	{
		int num1=0,num2=1,num3=0,count=3;
		System.out.print(num1+" "+num2+" ");
		while(count<num)
		{
			num3=num2+num1;
			num1=num2;
			num2=num3;
			System.out.print(num3+" ");
			count++;
		}
	}

}
