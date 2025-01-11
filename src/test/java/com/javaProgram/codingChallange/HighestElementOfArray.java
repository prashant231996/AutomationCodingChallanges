package com.javaProgram.codingChallange;

public class HighestElementOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int array[]=new int[] {1,2,3,4,5};
       int max=0;
       int min=99;
       for(int num:array)
       {
    	   if(num<min)
    	   {
    		   min=num;
    	   }
    	   if(num>max)
    	   {
    		   max=num;
    	   }
       }
       System.out.println("Maximum element from array is "+max);
       System.out.println("Minimum element from array is "+min);
	}

}
