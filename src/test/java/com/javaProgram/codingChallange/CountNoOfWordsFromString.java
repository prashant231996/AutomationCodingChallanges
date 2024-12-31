package com.javaProgram.codingChallange;

import java.util.HashMap;

public class CountNoOfWordsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="Prashant Shivaji More Shivaji";
        countOccurancesOfWords(str);
	}
	
	public static void countOccurancesOfWords(String str)
	{
		str=str.toLowerCase();
		String[]words=str.split(" ");
		int maxCount=0;
		HashMap<String,Integer>wordsMap=new HashMap<String,Integer>();
		String maxKey="";
		for(String word:words)
		{
			if(wordsMap.containsKey(word))
			{
				wordsMap.put(word, wordsMap.get(word)+1);
			}
			else
			{
				wordsMap.put(word,1);
			}
		}
		for(String key:wordsMap.keySet())
		{
			if(wordsMap.get(key)>maxCount)
			{
				maxCount=wordsMap.get(key);
				maxKey=key;
			}
		}
		System.out.println("String "+maxKey+" Occured for "+wordsMap.get(maxKey)+" times..");
	}

}
