package com.javaProgram.codingChallange;

import java.util.HashMap;

public class UniqueNumberFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= {1,1,2,2,3,4,5,5,6,6};
		HashMap<Integer,Integer>hmap=new HashMap<Integer, Integer>();
		for(int num:array)
		{
			if(hmap.containsKey(num))
			{
				hmap.put(num, hmap.get(num)+1);
			}
			else
			{
				hmap.put(num,1);
			}
		}
		
		System.out.println("Unique numbers from array are");
		for(int num:hmap.keySet())
		{
			if(hmap.get(num)==1)
			{
				System.out.println(num);
			}
		}

	}

}
