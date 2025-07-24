package com.test;

import java.util.*;

public class SecondLowestNumber {

	public static void main(String args[]) {
		int arr[] = {10,24,87,34,232,90,2};
		
		int n= arr.length;
		Arrays.sort(arr);
		
		System.out.println("Smallest Element is Array is :"+arr[0]);
		System.out.println("Largest Element in Array is :"+arr[n-1]);
		
		
		int smallest =Integer.MAX_VALUE;
		
		for(int i=0;i<n;i++) {
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		System.out.println("Smallest element is :"+smallest);
		
		int secondSmallest=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]<secondSmallest && arr[i] >smallest) {
				secondSmallest =arr[i];
				
			}
		}
		System.out.println("Second Smallst number is : "+secondSmallest);
		
	}
}
