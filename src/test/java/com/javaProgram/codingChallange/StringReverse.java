package com.javaProgram.codingChallange;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Prashant";
		reverseString(str);
	}
	
	public static void reverseString(String str)
	{
		str=str.toLowerCase();
		String revStr="";
		//Approch 1 using length() method and for loop
//		for(int i=str.length()-1;i>=0;i--)
//		{
//			revStr=revStr+str.charAt(i);
//		}
//		System.out.println("Reversed string is "+revStr);
		
		//Approch 2 Using StrinBuffer() or StringBuilder() class
		
		StringBuffer strUpd=new StringBuffer(str);
		strUpd.reverse();
		revStr=strUpd.toString();
		System.out.println("Reversed string is "+revStr);
	}

}
