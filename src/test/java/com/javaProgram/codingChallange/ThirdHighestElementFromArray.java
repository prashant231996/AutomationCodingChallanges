package com.javaProgram.codingChallange;

public class ThirdHighestElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[] {1,2,4,4,5};
		findThirdHighestEleement(array);
	}
	
	public static void findThirdHighestEleement(int array[])
	{
		int max=0,secondMax=0,thirdMax=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>max)
			{
				thirdMax=secondMax;
				secondMax=max;
				max=array[i];
			}
			else if(array[i]>secondMax && array[i]!=max)
			{
				thirdMax=secondMax;
				secondMax=array[i];
			}
			else if(array[i]>thirdMax && array[i]!=secondMax)
			{
				thirdMax=array[i];
			}
		}
		
		System.out.println("Third max number is "+thirdMax);
	
	}

}
