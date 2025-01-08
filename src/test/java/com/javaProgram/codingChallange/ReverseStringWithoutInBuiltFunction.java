package com.javaProgram.codingChallange;

public class ReverseStringWithoutInBuiltFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Prashant";
		str=str.toLowerCase();
		String revStr="";
		char ch[]=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			revStr=revStr+ch[i];
		}
		System.out.println("Reversed String is "+revStr);
	}

}
