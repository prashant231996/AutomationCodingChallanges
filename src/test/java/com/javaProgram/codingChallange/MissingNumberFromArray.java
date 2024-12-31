package com.javaProgram.codingChallange;

public class MissingNumberFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array=new int[] {1,2,4};
		missingNumberFromArray(array);
	}
	
	public static void missingNumberFromArray(int array[])
	{
		int n=array.length;
		n=n+1;
		int expectedSum=(n*(n+1))/2;
		int actualSum=0;
		int missedNumber;
		for(int num:array)
		{
			actualSum=actualSum+num;
		}
		missedNumber=expectedSum-actualSum;
		System.out.println("Missed Number from array is "+missedNumber);
	}

}
