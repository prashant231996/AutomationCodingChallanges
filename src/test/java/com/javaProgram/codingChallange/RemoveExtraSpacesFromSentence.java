package com.javaProgram.codingChallange;

public class RemoveExtraSpacesFromSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String statement="Prashant   Shivaji          More";
		System.out.println(reduceMultipleSpaces(statement));
	}
	
	public static String reduceMultipleSpaces(String statement)
	{
		if(statement==null)
			return null;
		statement=statement.replaceAll("\\s+", " ");
		return statement;
	}

}
