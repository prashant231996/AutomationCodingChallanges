package com.javaProgram.codingChallange;

public class MoveAllZeroesToEndOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]=new int[] {0,2,3,4,4,0,3,0,4,0,0,2,3,4,66,7};
		System.out.println("==>Array before moving zeroes to the end");
		for(int num:array)
		{
			System.out.print(num+"\t");
		}
		System.out.println();
		System.out.println("==>Array after moving zeroes to the end");
		int result[]=moveAllZeroesToEnd(array);
		for(int num:result)
		{
			System.out.print(num+"\t");
		}
	}
	
	public static int[] moveAllZeroesToEnd(int array[])
	{
		int count=0;
		int result[]=new int[array.length];
		for(int num:array)
		{
			if(num!=0)
			{
				result[count]=num;
				count++;
			}
		}
		while(count<array.length)
		{
			result[count]=0;
			count++;
		}
		return result;
	}

}
