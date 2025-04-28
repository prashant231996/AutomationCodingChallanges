package com.javaProgram.codingChallange;

import java.util.Arrays;

public class PrintArrayElementInDescendingOrder {

	public static void main(String[] args) {
		int array[]= {8,5,1,9,3};
		Arrays.parallelSort(array);
		int[] resultArray=new int[array.length];
		int i=0;
		int j=array.length-1;
		for(int num:array)
		{
			resultArray[i]=array[j];
			i++;
			j--;
		}
		System.out.println("Result array is ");
		for(int num:resultArray)
		{
			System.out.print(num +"  ");
		}

	}

}
