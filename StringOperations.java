package com.test;
import java.util.*;
public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to process : ");
		String s= sc.next();
		
		Map<Character , Integer> charCountMap=new HashMap<Character, Integer>();
		
		int count =0;
		for(char ch:s.toCharArray())
		{
			charCountMap.put(ch,charCountMap.getOrDefault(ch, 0)+1);
			System.out.println("Character is : "+ch+" occurance is  "+charCountMap.getOrDefault(ch,0));
		}
		System.out.println("Single Appearence characters are ");
		
		for(char ch:s.toCharArray())
		{
			if(charCountMap.get(ch)==1)
			{
				System.out.print("  "+ ch);
			}
		}
		
	}

}
