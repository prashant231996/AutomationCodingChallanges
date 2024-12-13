package com.javaProgram.codingChallange;

public class singletonDesignPattern {
	
	//Singleton design pattern is basically used to restrict object creation.
	//Using singleton design pattern we can create only one object.
	
	//private constructor as we need to restrict object creation
	private singletonDesignPattern()
	{
		System.out.println("Object Created.");
	}
	
	//Object is static bcz we need single copy
	private static singletonDesignPattern object;
	
	public static singletonDesignPattern getInstance()
	{
		if(object==null)
		{
			object=new singletonDesignPattern();
		}
		
		return object;
	}
	
	public void display()
	{
		System.out.println("You are in display method");
	}
	
	public static void main(String args[])
	{
		object=getInstance();
		object.display();
		object=getInstance();
		object.display();
		
	}
	
	

}
