package com.javaProgram.codingChallange;

import java.util.ArrayList;
import java.util.List;

public class ListWithSquereOfEvenNumber {
	
	public static void main(String args[])
	{
		List<Integer> Given_list = new ArrayList<Integer>();
		Given_list.add(1);
		Given_list.add(4);
		Given_list.add(3);
		Given_list.add(6);
		Given_list.add(8);
		squereEvenNumbers(Given_list);
	}
	
	public static void squereEvenNumbers(List<Integer>list)
	{
		List<Integer>resultList=new ArrayList<Integer>();
		for(int num:list)
		{
			if(num%2==0)
			{
				resultList.add(num*num);
			}
			else
			{
				resultList.add(num);
			}
		}
		System.out.println("Result list is "+resultList.toString());
	}

}
