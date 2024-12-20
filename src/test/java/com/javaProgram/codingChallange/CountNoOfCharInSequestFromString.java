package com.javaProgram.codingChallange;

public class CountNoOfCharInSequestFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /*
        * Write a simple Java Program in Java that takes input as 
         Input: aaabbbacfwww
         and give Output: a3b3acfw3
        */
		String str="aaabbbacfwww";
		countNoOfCharInSequence(str);
	}
	
	public static void countNoOfCharInSequence(String str)
	{
		str=str.toLowerCase();
		int count=1;
		for(int i=0;i<str.length();i++)
		{
			if(i!=0 && i<str.length())
			{
		    char ch=str.charAt(i-1);
		    if(str.charAt(i)==ch)
			{
				count++;
			}
			else
			{
				if(count!=1)
				{
				System.out.print(ch+""+count);
				count=1;
				}
				else
				{
					System.out.print(ch);
					count=1;
				}
			}
		    }
	   }
	}

}
