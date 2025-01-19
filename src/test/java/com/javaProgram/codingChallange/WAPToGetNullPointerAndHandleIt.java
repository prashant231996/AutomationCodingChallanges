package com.javaProgram.codingChallange;

public class WAPToGetNullPointerAndHandleIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=null;
		try
		{
			str.toString();
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
			System.out.println("Got null pointer execption");
		}

	}

}
