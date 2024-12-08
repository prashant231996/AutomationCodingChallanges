package com.javaProgram.codingChallange;

import java.util.ArrayList;
import java.util.List;

public class SumOfIntegersFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SumOf Integers from String
		//For Ex: Prashant123==>O/P 6
		
		String str="Prashant123fhf";
		getSumOfIntegersFromString(str);
	}
	
	public static void getSumOfIntegersFromString(String str)
	{
		List<Character>resultList=new ArrayList<Character>();
		List<Integer>integerList=new ArrayList<Integer>();
		int total=0;
		for(Character ch:str.toCharArray())
		{
			if(Character.isDigit(ch))
			{
				resultList.add(ch);
			}
		}
			int sum=0;
			for(Character chara:resultList)
			{
			String result="";
			result=result+chara;
			sum=sum+Integer.parseInt(result);
		    }
			
			System.out.println("Sum of digits from string is from Inner Loop "+sum);
		
      } 
	
}
