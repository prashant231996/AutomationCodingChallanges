package com.javaProgram.codingChallange;

import java.util.Arrays;

public class MoveNegativeNumberToLeftOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {1,2,3,-3,-5,4,6,-8,0};
		//Approch 1
		/*int result[]=new int[array.length];
        int i=0;
		for(int num:array)
		{
			if(num<0)
			{
				result[i]=num;
				i++;
			}
		}
		for(int num:array)
		{
			if(num>0)
			{
				result[i]=num;
				i++;
			}
		}
		System.out.println("Resultant array is ");
		for(int num:result)
		{
			System.out.print(num+" ");
		}
	}*/
		
	//Approch 2
	Arrays.sort(array);
	System.out.println("Resultant array is ");
	for(int num:array)
	{
		System.out.print(num+" ");
	}
	}

}
