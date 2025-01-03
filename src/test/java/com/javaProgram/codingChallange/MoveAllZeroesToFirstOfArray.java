package com.javaProgram.codingChallange;

public class MoveAllZeroesToFirstOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]=new int[] {1,2,3,0,3,0,46,0,5,58,0,34,0,938,0};
		System.out.println("==>Array before moving zeroes to start");
		for(int num:array)
		{
		System.out.print(num+"\t");
		}
		System.out.println();
		int result[]=moveAllZeroesToStartOfArray(array);
		System.out.println("==>Array after moving zeroes to start");
		for(int num:result)
		{
		System.out.print(num+"\t");
		}
		System.out.println();
	}
	
	public static int[] moveAllZeroesToStartOfArray(int array[])
	{
		int count=array.length-1;
		int result[]=new int[array.length];
		for(int num:array)
		{
			if(num!=0)
			{
				result[count]=num;
				count--;
			}
		}
		while(count>=0)
		{
			result[count]=0;
			count--;
		}
		return result;
	}

}
