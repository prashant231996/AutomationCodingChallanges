package com.javaProgram.codingChallange;

import java.util.HashSet;
import java.util.Set;

public class LogestUniqueSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="Prashant";
        String maxString=uniqueSubString(str);
        System.out.println("Maximum lenght of substring: "+maxString);
	}
	
	public static String uniqueSubString(String str)
	{
		str=str.toLowerCase();
		int maxLength=0;
		String maxString="";
		Set<String>subStrings=new HashSet<String>();
		Set<String>uniqueStrings=new HashSet<String>();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				subStrings.add(str.substring(i, j));
			}
		}
		for(String strVal:subStrings)
		{
			count=0;
			for(int i=0;i<strVal.length();i++)
				{
					for(int j=i+1;j<strVal.length();j++)
					{
						if(str.charAt(i)==str.charAt(j))
						{
							break;
						}
						else
						{
							count++;
						}
					}
				}
			if(count==strVal.length())
			{
				uniqueStrings.add(strVal);
			}
		}
		for(String strValNew:uniqueStrings)
		{
			if(strValNew.length()>maxLength)
			{
				maxLength=strValNew.length();
				maxString=strValNew;
			}
		}
		return maxString;
	}

}
