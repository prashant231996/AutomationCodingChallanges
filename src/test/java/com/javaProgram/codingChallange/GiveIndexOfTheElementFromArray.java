package com.javaProgram.codingChallange;

import java.util.ArrayList;
import java.util.List;

public class GiveIndexOfTheElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= {1,2,3,4,5,3,2,1,34,5};
		int num=23;
		
		List<Integer>indexes=getIndexOfNumber(array,num);
		if(indexes.size()!=0)
		{
		System.out.println("Indexes of given number are");
		for(int index:indexes)
		{
			System.out.print(index+" ");
		}
		}
		else
		{
			System.out.println("element not found");
		}

	}
	
	public static List<Integer>getIndexOfNumber(int array[],int num)
	{
		List<Integer>numbers=new ArrayList<Integer>();
		int i=0;
		for(int numEle:array)
		{
			if(numEle==num)
			{
				numbers.add(i);
			}
			i++;
		}
		return numbers;
	}

}
