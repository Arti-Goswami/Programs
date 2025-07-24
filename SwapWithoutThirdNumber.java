package com.test;
public class SwapWithoutThirdNumber {
	public static void main(String[] args) {
		int a=100;
		int b=200;

		// using + operator
		a=a+b; //100+200 =300
		b=a-b; // 300-200 =100
		a=a-b; // 300-100 = 200
		System.out.println(a);
		System.out.println(b);

		// using multiplication operator
		int x=5; // 0101
		int y=10; //1010
		x=x*y; // 50
		y=x/y; //5
		x=x/y; //10
		System.out.println(x);
		System.out.println(y);
		
		// using XOR:^ - bit wise conversion
		x=x^y; // 15 // 1111
		y=x^y; //10 //10101
		x=x^y; //5 --- 0101
		System.out.println(x);
		System.out.println(y);
	}
}
