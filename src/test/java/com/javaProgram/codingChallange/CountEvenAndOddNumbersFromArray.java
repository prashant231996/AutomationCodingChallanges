package com.javaProgram.codingChallange;

public class CountEvenAndOddNumbersFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= {1,2,3,4,5,6,7,8,9};
		int oddCount=0;
		int evenCount=0;
		for(int num:array)
		{
			if(num%2==0)
			{
				evenCount++;
			}
			if(num%2!=0)
			{
				oddCount++;
			}
		}
		System.out.println("Odd numbers are "+oddCount);
		System.out.println("Even numbers are "+evenCount);

	}

}
