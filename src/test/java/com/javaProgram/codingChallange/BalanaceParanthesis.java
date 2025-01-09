package com.javaProgram.codingChallange;

import java.util.Stack;

public class BalanaceParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="{}[]";
		boolean flag=checkBalanaceParanthesis(str);
		if(flag)
			System.out.println("String is balanced");
		else
			System.out.println("String is not balanaced");
	}
	
	public static boolean checkBalanaceParanthesis(String str)
	{
		Stack<Character>strStack=new Stack<Character>();
		char chArray[]=str.toCharArray();
		for(int i=0;i<chArray.length;i++)
		{
			if(chArray[i]=='(' || chArray[i]=='[' || chArray[i]=='{')
			{
				strStack.push(chArray[i]);
			}
			else if(chArray[i]==')')
			{
				if(strStack.pop()!='(')
					return false;
			}
			else if(chArray[i]=='}')
			{
				if(strStack.pop()!='{') 
					return false;
			}
			else if(chArray[i]==']')
			{
				if(strStack.pop()!='[')
					return false;
			}
		}
		if(!strStack.isEmpty())
		{
			return false;
		}
		return true;
	}

}
