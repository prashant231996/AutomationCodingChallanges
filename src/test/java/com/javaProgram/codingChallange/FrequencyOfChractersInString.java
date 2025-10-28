package com.javaProgram.codingChallange;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfChractersInString {

    public static void main(String args[])
    {
        String name="Om";
        countFrequencyOfEachCharacter(name);
    }

    public static void countFrequencyOfEachCharacter(String str)
    {
        str=str.toLowerCase();
        char[]charArray=str.toCharArray();
        Map<Character,Integer> charMap=new HashMap<>();
        for(Character ch:charArray)
        {
            if(Character.isLetter(ch))
            {
                if(charMap.containsKey(ch))
                {
                    charMap.put(ch,charMap.getOrDefault(ch,0)+1);
                }
                else {
                    charMap.put(ch,1);
                }
            }
        }
        System.out.println("Frequency of each characters in string is");
        for(Character ch:charMap.keySet())
        {
            System.out.println("Chracter "+ch+"Comes for "+charMap.get(ch)+" times.");
        }
    }


}
