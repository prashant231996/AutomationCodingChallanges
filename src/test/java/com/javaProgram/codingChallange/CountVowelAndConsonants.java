package com.javaProgram.codingChallange;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountVowelAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Prashant";
		
		countAndPringVowelAndConsonanats(str);

	}
	
	public static void countAndPringVowelAndConsonanats(String str)
	{
		Set<Character>vowelset=new HashSet<Character>();
		Set<Character>consonantset=new HashSet<Character>();
		str=str.toLowerCase();
		for(Character ch:str.toCharArray())
		{
			if("aeiou".indexOf(ch)!=-1)
			{
				vowelset.add(ch);
			}else if(Character.isLetter(ch))
			{
				consonantset.add(ch);
			}
		}
		
		System.out.println("Number of vowels "+vowelset.size());
		System.out.println("Number of consonants:"+consonantset.size());
		System.out.print("Vowels are ");
		for(Character ch:vowelset)
		{
			System.out.print(ch+" ");
		}
		System.out.println();
		System.out.print("Consonants are ");
		for(Character ch:consonantset)
		{
			System.out.print(ch+" ");
		}
	}

}
