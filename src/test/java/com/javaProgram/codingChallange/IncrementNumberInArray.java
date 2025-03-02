package com.javaProgram.codingChallange;

public class IncrementNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {1,2,9};
		int num=0;
		for(int i=0;i<array.length;i++)
		{
			num=num*10+array[i];
		}
		System.out.println("Numbetr is "+num);
		int resultNum=num+1;
		System.out.println("Resultant numebr is "+resultNum);
		int[] resultArray=new int[String.valueOf(resultNum).length()];
		int j=resultArray.length;
	    while(resultNum>0)
		{
		   int rem=resultNum%10;
		   resultArray[--j]=rem;
		   resultNum=resultNum/10;
		}
		System.out.println("Resultant array is ");
		for(int number:resultArray)
		{
			System.out.print(number+" ");
		}

	}

}
