package com.javaProgram.codingChallange;

public class ReverseAlternateWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="selenium cypress playwright webdriverio";
		reverseAlternateWord(str);
	}
	
	public static void reverseAlternateWord(String str)
	{
		str=str.toLowerCase();
		String[]words=str.split(" ");
		String updatedString="";
		for(int i=0;i<words.length;i++)
		{
			if(i!=0)
			{
			if(i%2!=0)
			{
				StringBuilder sb=new StringBuilder(words[i]);
				sb.reverse();
				words[i]=sb.toString();
				System.out.println("Reversed word "+words[i]);
			}
			}
			updatedString=updatedString+words[i]+" "; 
		}
		System.out.println("Final string after reversing alternate words: "+updatedString);
	}

}
