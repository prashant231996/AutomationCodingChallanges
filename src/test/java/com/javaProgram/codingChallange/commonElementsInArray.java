package com.javaProgram.codingChallange;

import java.util.ArrayList;
import java.util.List;

public class commonElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[]=new int[] {1,2,3,2,1};
		int array2[]=new int[] {1,2,3};
		int array3[]=new int[] {1,2,3,4};
		
		int n1=array1.length;
		int n2=array2.length;
		int n3=array3.length;
		
		int min=n1<n2?n1:n2;
		min=min<n3?min:n3;
		
		List<Integer>arrayList=new ArrayList<Integer>();
		for(int i=0;i<min;i++)
		{
			if(array1[i]==array2[i])
			{
				if(array2[i]==array3[i])
				{
					arrayList.add(array3[i]);
				}
				
			}
		}
		System.out.println("Common elements are "+arrayList);
		

	}

}
