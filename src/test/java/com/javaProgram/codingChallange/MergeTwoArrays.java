package com.javaProgram.codingChallange;

public class MergeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array1[]=new int[] {1,2,3,4,5};
		int array2[]=new int[] {6,7,8};
		int n1=array1.length;
		int n2=array2.length;
		int n3=n1+n2;
		int result[]=new int[n3];
		int j=0;
		for(int i=0;i<n1;i++)
		{
			result[j]=array1[i];
			j++;
		}
		for(int i=0;i<n2;i++)
		{
			result[j]=array2[i];
			j++;
		}
		for(int num:result)
		{
			System.out.print(num+"\t");
		}
		
	}

}
