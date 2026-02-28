package com.javaProgram.codingChallange;

import java.util.HashMap;
import java.util.Map;

public class CreateEncodedStringFromString {

    public static void main(String args[])
    {
        String str="AAABBCCDFS";
        System.out.println("Decoded string is "+decodeString(str));
    }

    public static String decodeString(String str)
    {
        Map<Character,Integer> hmap=new HashMap<>();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<str.length();i++)
        {
            if(hmap.containsKey(str.charAt(i)))
            {
                hmap.put(str.charAt(i),hmap.get(str.charAt(i))+1);
            }
            else
            {
                hmap.put(str.charAt(i),1);
            }
        }
        for(Character ch:hmap.keySet())
        {
            sb.append(ch+hmap.get(ch).toString());
        }
        return sb.toString();
    }


}
