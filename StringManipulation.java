package com.test;

public class StringManipulation {

	public static void main(String[] args) {
		String str="The rain has started here selenium";
		String str1="The rain has started here selenium";
		String str2="The rain Has started here selenium";

		System.out.println(str.length());

		// which character is there on 5th location /index
		System.out.println(str.charAt(5));

		//what is the index of s
		System.out.println(str.indexOf('s'));

		// one more s is there so how will it validate index of secons s char start counting from 9th location
		System.out.println(str.indexOf('s', 9)); // hardcoding check of char after first s character
		System.out.println(str.indexOf('s', str.indexOf('s')+1)); // dynamically checking position after first occurance of s


		char target = 's';

		// Find the first occurrence of 's'
		int firstIndex = str.indexOf(target);

		// Find the second occurrence of 's' after the first index
		int secondIndex = str.indexOf(target, firstIndex + 1);

		// Find the third occurrence of 's' after the second index
		int thirdIndex = str.indexOf(target, secondIndex + 1);

		System.out.println("First occurrence of 's': " + firstIndex);    // For verification
		System.out.println("Second occurrence of 's': " + secondIndex);  // For verification
		System.out.println("Third occurrence of 's': " + thirdIndex);    // This is the required index

		System.out.println(str.indexOf("has"));
		System.out.println(str.indexOf("hello")); // it will return -1

		// String comparison
		System.out.println(str.equals(str1)); // true

		// String comparison
		System.out.println(str.equals(str2)); // false as java is case sensitive

		// String comparison
		System.out.println(str.equalsIgnoreCase(str2)); // true as java is case sensitive and we are ignoring case sensitivity

		// substing
		System.out.println(str.substring(0,9)); // start index and end index

		// trim
		String s="     Hello World";
		System.out.println(s.trim()); // only forword and backword spaces will be removed
		System.out.println(s.replace(" ", "")); /// all spaces will be replaced by empty char

		String date="01-01-2017"; // convert to "01/01/2017"
		System.out.println(date.replace("-", "/"));


		// split: return type is string array
		String test="Hello_World_Test_Selenium";
		String test1[] = test.split("_");
		for (int i=0;i<test1.length;i++) {
			System.out.println(test1[i]);
		}

		String s2="care";
		System.out.println(s2.concat("s"));


		String x="Hello";
		String y="World";
		int a =100;
		int b=200;
		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(x+y+a+b); //compiler will execute from left to right HelloWorld100200

		System.out.println(a+b+x+y);//compiler will execute from left to right 300HelloWorld
		System.out.println(x+y+(a+b));//compiler will execute from left to right HelloWorld300 as bracket provided
		//+ concatenation oeprator but bracket provided so left to right
	}

}
