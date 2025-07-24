package com.test;

public class RemoveJunkChars {

	public static void main(String[] args) {
		
		String s ="*&&^&S*AS^&%SLatin String(**&^^%%";
		String s1 ="*&&^& S*A S^&%  SLatin String (**&^^%%";
		// Regular Expression : [^a-zA-Z0-9]
		// ^ this is not expression of regular expression
		// replace all function takes first arg as regular expression and second as replacement character which we want

		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		// it removes spaces and junk chars
		s1=s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
	}

}
