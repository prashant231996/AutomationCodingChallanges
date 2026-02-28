package com.javaProgram.codingChallange;

public class CreateStringFromEncodedString {

    public static void main(String args[])
    {
        String decodedString="A2B3C1";
        System.out.println("Final decoded String is "+decodeTheString(decodedString));

    }

    public static String decodeTheString(String decodedString)
    {
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<decodedString.length();i=i+2)
        {
            int count=Character.getNumericValue(decodedString.charAt(i+1));
            for(int j=0;j<count;j++)
            {
                sb=sb.append(decodedString.charAt(i));
            }
        }
        return sb.toString();
    }


}
