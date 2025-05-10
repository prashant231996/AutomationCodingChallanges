package com.javaProgram.codingChallange;

import java.util.Arrays;

public class FindArrayIsSortedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= {2,3,1,4,5};
		if(checkArrayIsSorted(array,array.length))
			System.out.println("Array is in sorted order");
		else
			System.out.println("Array is not in sorted order");
	}
	
	public static boolean checkArrayIsSorted(int array[],int n)
	{
	    if(n==0 || n==1)
	    	return true;
	    for(int i=1;i<n;i++)
	    	if(array[i-1]>array[i])
	    		return false;
	    return true;
	}

}
