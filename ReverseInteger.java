package com.test;

public class ReverseInteger {
	public static void main(String[] args) {
		int num = 12345;
		int rev =0;
		
		//1 st solution
		while(num!=0){
			rev =rev*10 +num%10;
			num=num/10;
		}
		System.out.println("reverse of num is "+rev);
		
		// 2nd solution using StringBuffer method
		int num1=123456;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	}
}
