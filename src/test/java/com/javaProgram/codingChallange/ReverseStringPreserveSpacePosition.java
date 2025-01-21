package com.javaProgram.codingChallange;

public class ReverseStringPreserveSpacePosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="prashant shiveji more";
		reverseStringWithPreserveSpacePosition(str);
	}
	
	public static void reverseStringWithPreserveSpacePosition(String str)
	{
		char charArray[]=str.toCharArray();
		char result[]=new char[charArray.length];
		
		//Marking spaces position in result array
		for(int i=0;i<charArray.length;i++)
		{
			if(charArray[i]==' ')
			{
				result[i]=' ';
			}
		}
		
		//Traversing char array from beginning and filling result array from last index
		//If index already contains space we are filling data in next index
		int j=charArray.length-1;
		for(int i=0;i<charArray.length;i++)
		{
			if(charArray[i]!=' ')
			{
				if(result[j]==' ')
				{
					j--;
				}
				result[j]=charArray[i];
				j--;
			}
		}
		
		System.out.println("Resultant array is "+String.valueOf(result));
	}

}
