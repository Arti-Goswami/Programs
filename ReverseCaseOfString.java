package com.test;
import java.util.*;

public class ReverseCaseOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String to reverse the Case : ");
		String s = sc.nextLine();
		StringBuilder result = new StringBuilder();
		char data[] = s.toCharArray();

		for (char c : data) {
			if (Character.isUpperCase(c)) {
				result.append(Character.toLowerCase(c));
			} else if (Character.isLowerCase(c)) {
				result.append(Character.toUpperCase(c));
			} else {
				result.append(c);
			}
		}

		System.out.println("Original String is : " + s);
		System.out.println("Reverse Case String is : " + result.toString());

	}

}
