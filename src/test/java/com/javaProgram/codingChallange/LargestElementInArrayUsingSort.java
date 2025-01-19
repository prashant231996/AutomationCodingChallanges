package com.javaProgram.codingChallange;

import java.util.Arrays;

public class LargestElementInArrayUsingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]=new int[] {23,4,36,2,1,4};
		//Sorting array in ascending
		Arrays.sort(array);
		//Finding min element
		System.out.println("Miniumn element is "+array[0]);
		//Finding second min element
		System.out.println("Second miniumn element is "+array[1]);
		//Finding maximum element
		System.out.println("Maximum element is "+array[array.length-1]);
		//Finding second maximum element
	    System.out.println("Second maximum element is "+array[array.length-2]);
	}

}
