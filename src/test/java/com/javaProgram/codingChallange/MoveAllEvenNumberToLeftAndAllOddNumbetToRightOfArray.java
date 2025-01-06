package com.javaProgram.codingChallange;

public class MoveAllEvenNumberToLeftAndAllOddNumbetToRightOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]=new int [] {1,2,3,4,5,6};
		moveAllEvenToLeftAndOddToRight(array);
	}
	
	public static void moveAllEvenToLeftAndOddToRight(int array[])
	{
		int result[]=new int[array.length];
		int count=0;
		for(int num:array)
		{
			if(num%2==0)
			{
				result[count]=num;
				count++;
			}
		}
		for(int num:array)
		{
			if(num%2!=0)
			{
				result[count]=num;
				count++;
			}
		}
		System.out.println("After sorting array with respective condition:");
		for(int num:result)
		{
			System.out.print(num+"\t");
		}
	}

}
