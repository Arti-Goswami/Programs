package com.test;

public class SwapTwoStringVariables {

	public static void main(String[] args) {
		String a= "Hello";
		String b="World";
		System.out.println("Before Swapping : ");
		System.out.println("Value of a is :  "+a);
		System.out.println("Value of b is :  "+b);

		// append a and b
		a=a+b; // HelloWorld

		// store initial string a in string b
		b=a.substring(0,a.length()-b.length());

		// store initial string b in string a
		a=a.substring(b.length());

		System.out.println("After Swapping : ");
		System.out.println("Value of a is :  "+a);
		System.out.println("Value of b is :  "+b);
	}

}
