package com.javaProgram.codingChallange;

public class ReverseEachWordOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Prashant Shivaji More";
		reverseEachWord(str);
	}
	
	public static void reverseEachWord(String str)
	{
		str=str.toLowerCase();
		String words[]=str.split(" ");
		String revreserdWord="";
		for(String word:words)
		{
			StringBuilder strBuilder=new StringBuilder(word);
			strBuilder.reverse();
			revreserdWord=revreserdWord+strBuilder.toString()+" ";
		}
		System.out.println("Reveresed string is "+revreserdWord);
	}

}
