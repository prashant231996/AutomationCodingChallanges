package com.javaProgram.codingChallange;

public class SumOfDigitInGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="asgf4kjh678kh5f";
		getSumOfDigit(str);
	}
	
	public static void getSumOfDigit(String str)
	{
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			String num="";
			if(Character.isDigit(str.charAt(i)))
			{
				if(Character.isDigit(str.charAt(i+1)))
				{
					if(Character.isDigit(str.charAt(i+2)))
					{
					num=num+str.charAt(i)+str.charAt(i+1)+str.charAt(i+2);
					sum=sum+Integer.parseInt(num);
					i=i+2;
					}
					else
					{
						num=num+str.charAt(i)+str.charAt(i+1);
						sum=sum+Integer.parseInt(num);
						i=i+1;
					}
				}
				else
				{
					num=num+str.charAt(i);
					sum=sum+Integer.parseInt(num);
				}
			}
		}
		System.out.println("Sum of digits present in string is "+sum);
	}
	
	//Logic2
	public static void getSumOfDigit(String str,boolean flag)
	{
		int i=0;
		for(i=0;i<str.length();i++)
		{
			String num="";
			if(Character.isDigit(str.charAt(i)))
			{
				int k=i;
				while(k<str.length())
				{
					k++;
					if(Character.isDigit(str.charAt(k)))
					{
						
					}
					else
					{
						break;
					}
				}
//				for(i;i<k;i++)
//				{
//				num=num+str.charAt(i);
//				}
			}
		}
	}

}
