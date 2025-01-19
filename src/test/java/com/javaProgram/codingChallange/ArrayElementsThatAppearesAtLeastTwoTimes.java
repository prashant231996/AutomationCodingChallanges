package com.javaProgram.codingChallange;

import java.util.HashMap;

public class ArrayElementsThatAppearesAtLeastTwoTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]=new int[] {1,2,2,3,3,3,4};
		findElementsThatAppearsAtLeasTwice(array);
		
	}
	
	public static void findElementsThatAppearsAtLeasTwice(int array[])
	{
		HashMap<String,Integer>hmap=new HashMap<String,Integer>();
		for(int num:array)
		{
		if(hmap.containsKey(String.valueOf(num)))
		{
			hmap.put(String.valueOf(num), hmap.get(String.valueOf(num))+1);
		}
		else
		{
			hmap.put(String.valueOf(num),1);
		}
		}
		
		for(String key:hmap.keySet())
		{
			if(hmap.get(key)>=2)
			{
				System.out.println("Number appears more than or equal to twice "+key);
			}
		}
	}

}
