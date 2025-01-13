package com.javaProgram.codingChallange;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="abbcaa";
		String compressedString=stringCompression(str);
		System.out.println("String compression is "+compressedString);
}
	
	public static String stringCompression(String str)
	{
		str=str.toLowerCase();
		int count=0;
		StringBuilder strCompressed=new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			count++;
			if(i+1>=str.length() || str.charAt(i+1)!=str.charAt(i))
			{
				strCompressed.append(str.charAt(i));
				strCompressed.append(count);
				count=0;
			}
		}
		return strCompressed.toString();
	}
}
