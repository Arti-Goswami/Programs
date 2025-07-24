package com.test;

public class reverseString {

	public static void main(String[] args) {
		String s="Selenium";
		
		// 1. using loop
		int len = s.length();
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		//2. Using StringBuffer Class method		
		StringBuffer sf = new  StringBuffer(s);		
		System.out.println(sf.reverse());
			}
}
