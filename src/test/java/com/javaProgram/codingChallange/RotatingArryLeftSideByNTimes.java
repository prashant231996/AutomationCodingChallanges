package com.javaProgram.codingChallange;

public class RotatingArryLeftSideByNTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]=new int[]{1,2,3,4,5};
		int leftRotateCount=3;
		System.out.println("Array elements before rotating elemnts to left side.");
        for(int num:array)
        {
        	System.out.print(num+" ");
        }
        System.out.println();
      
        for(int i=0;i<leftRotateCount;i++)
        {
        	 int first=array[0];
        	 for(int j=0;j<array.length-1;j++)
        	 {
        		 array[j]=array[j+1];
        	 }
        	 array[array.length-1]=first;
        }
        
        System.out.println("Array elements after rotating elemnts to left side.");
        for(int num:array)
        {
        	System.out.print(num+" ");
        }
        System.out.println();
	}
	
	

}
