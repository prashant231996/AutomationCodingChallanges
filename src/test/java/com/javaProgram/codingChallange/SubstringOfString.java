package com.javaProgram.codingChallange;

import java.util.ArrayList;
import java.util.List;

public class SubstringOfString {
	
	public static void main(String args[])
	{
		String str="Prashant";
		List<String>subStringList=findSubStrings(str);
		System.out.println("SubStrings of given strings are as follow: ");
		for(String strVal:subStringList)
		{
			System.out.println(strVal);
		}
	}
	
	public static List<String> findSubStrings(String str)
	{
		str=str.toLowerCase();
		List<String>subStringList=new ArrayList<String>();
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				subStringList.add(str.substring(i, j));
			}
		}
		return subStringList;
	}

}
