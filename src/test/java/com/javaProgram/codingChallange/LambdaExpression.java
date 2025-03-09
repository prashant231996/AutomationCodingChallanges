package com.javaProgram.codingChallange;

//Function Interface==> Functional Interface is a interface which contains only one abstract method, 
//which is basically used to invoke lambda expression.

 interface Cab
{
	public void bookCab(String source, String destination);
}

//Lambda Expression==>Lamda expression is an annonymous function which doesn't have access modifier, return type
//and method name, which are basically invoke by functional interface
public class LambdaExpression {

	public static void main(String[] args) {
     Cab cab=(source, destination)->{System.out.println("Booking cab from "+source+" to destination "+destination);};
     cab.bookCab("Ichalkaranji", "Pune");
	}
}
