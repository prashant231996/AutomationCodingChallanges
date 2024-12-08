package com.javaProgram.codingChallange;

public class SplitStringBasedOnDelimiter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="you are a great tester: you are great automation tester: you are a full stack tester";
		String[]strArray=str.trim().split(":");
		System.out.println("Length= "+strArray.length);
		for(String strval:strArray)
		{
		System.out.println(strval);
		}
	}

}
