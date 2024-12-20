package com.javaProgram.codingChallange;

public class SumOfElementsOfArray {
	
	public static void main(String args[])
	{
	int arr[]=new int[] {1,2,3,4,5};
	System.out.println("Sum Of elements "+sumOfEleOfArray(arr));
	}
	
	public static int sumOfEleOfArray(int arr[])
	{
		int sum=0;
		for(int num:arr)
		{
			sum=sum+num;
		}
		return sum;
	}

}
