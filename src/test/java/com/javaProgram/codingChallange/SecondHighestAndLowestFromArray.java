package com.javaProgram.codingChallange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondHighestAndLowestFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[]{1,2,3,4,5,6,7};
	    //Approach 1
		List<Integer>resultList=findSecondLargestAndSmallest(arr);
		System.out.println("Second Largest Number: "+resultList.get(0));
		System.out.println("Second Lowest Number: "+resultList.get(1));
		//Approch 2
		Arrays.sort(arr);
		System.out.println("Second largest number is using approch 2 is "+arr[arr.length-2]);
		System.out.println("Second smallest number is using approch 2 is "+arr[1]);
		
	}
	
	public static List<Integer> findSecondLargestAndSmallest(int arr[])
	{
			int max=0;
			int secondMax=0;
			int low=9999;
			int secondLow=9999;
			for(int num:arr)
			{
				if(num>max)
				{
					secondMax=max;
					max=num;
				}
				else if(num>secondMax && num!=max)
				{
					secondMax=num;
				}
				
				if(num<low)
				{
					secondLow=low;
					low=num;
				}
				else if(num<secondLow && num!=low)
				{
					secondLow=num;
				}
					
	          }
			
			List<Integer>resultList=new ArrayList<Integer>();
			resultList.add(secondMax);
			resultList.add(secondLow);
			return resultList;

     }
	
}
