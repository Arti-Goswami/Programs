package com.test;

import java.util.Arrays;

public class SecondLargestNoFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int a[]= {56,78,77,90,101};
	
		printSecondLargets(a);
		
	}
	
	public static void printSecondLargets(int arr[]) {
		int size =arr.length;
		if(size<2) {
			System.out.println("invalid input");
			return;
			
			
		}
		Arrays.sort(arr);
		System.out.println(arr[size-2]);
		
	}

}
