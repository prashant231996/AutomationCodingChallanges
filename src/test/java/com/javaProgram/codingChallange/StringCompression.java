package com.javaProgram.codingChallange;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="abbc";
		str=str.toLowerCase();
		int count=1;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(i!=0)
			{
				if(str.charAt(i-1)==ch)
				{
					count++;
					continue;
				}
			}
	   }

}
}
