package com.javaProgram.codingChallange;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayInDescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int array[]= {2,3,1};
        //Sort the array in acending order
        Arrays.sort(array);
        System.out.println("Sorted array in ascending order "+Arrays.toString(array));
     // Sorting the array in descending order
        //Approch 1
//        Arrays.sort(array, Collections.reverseOrder());
//        System.out.println(Arrays.toString(array));
        //Approch 2
        reverse(array);
	}
	
	public static void reverse(int sortedArray[])
	{
		int n=sortedArray.length;
		for(int i=0;i<n/2;i++)
		{
			int temp=sortedArray[i];
			sortedArray[i]=sortedArray[n-i-1];
			sortedArray[n-i-1]=temp;
		}
		System.out.println("Array in descending order is "+Arrays.toString(sortedArray));
	}

}
