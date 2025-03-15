package com.javaProgram.codingChallange;

import java.util.HashMap;

public class CountOfEachCharacterAndReplaceItsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *  Input = "Automation"
            Output= "2u22m22i2n"
		 */
		
		String str="Automation";
		String result="";
		str=str.toLowerCase();
		HashMap<Character,Integer>hmap=new HashMap<Character, Integer>();
        for(Character ch:str.toCharArray())
        {
        	if(hmap.containsKey(ch))
        	{
        		hmap.put(ch, hmap.get(ch)+1);
        	}
        	else
        	{
        		hmap.put(ch,1);
        	}
        }
        for(Character ch:str.toCharArray())
        {
        	if(hmap.get(ch)>1)
        	{
        		result=result+String.valueOf(hmap.get(ch));
        	}
        	else
        	{
        		result=result+ch;
        	}
        }
        System.out.println("Resultant string is "+result);
	} 

}
