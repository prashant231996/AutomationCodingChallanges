package com.javaProgram.codingChallange;

public class RotateArrayNnumberOfTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int arr[]=new int[] {1,2,3,4,5};
		 //Write program to rotate array n number of times
		 int n=3;
		 
		 //Printing original array
		 for(int num:arr)
		 {
			 System.out.print(num +" ");
		 }
		 System.out.println();
		 
		 //Rotate the given array by n times toward right  
		 for(int i=0;i<n;i++)
		 {
			 //Stores the last element of array  
			 int last=arr[arr.length-1];
			 for(int j=arr.length-1;j>0;j--)
			 {
				  //Shift element of array by one  
				 arr[j]=arr[j-1];
			 }
			 //Last element of array will be added to the start of array.  
			 arr[0]=last;	 
		 }
		 //Displays resulting array after rotation  
	        System.out.println("Array after right rotation: ");  
	        for(int i = 0; i< arr.length; i++){  
	            System.out.print(arr[i] + " ");  
	        }  
	}

}
