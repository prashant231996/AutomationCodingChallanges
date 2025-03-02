package com.javaProgram.codingChallange;

import org.apache.commons.codec.language.Nysiis;

public class MovesAllZeroesToBegin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numarray[]= {2,4,0,0,3,0,5,0};
		int resultarray[]=new int[numarray.length];
		int j=0;
		for(int num:numarray)
		{
			if(num==0)
			{
				resultarray[j]=num;
				j++;
			}
		}
		for(int num:numarray)
		{
			if(num!=0)
			{
				resultarray[j]=num;
				j++;
			}
		}
		System.out.println("Resultanat array is ");
		for(int num:resultarray)
		{
			System.out.print(num+" ");
		}

	}

}
