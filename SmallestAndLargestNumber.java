package com.test;

import java.util.Arrays;

public class SmallestAndLargestNumber {
	public static void main(String[] args) {
		int numbers[] = {-10,33,50,-88,9886842,45};	
		int largest=numbers[0];
		int smallest =numbers[0];
		// time complexity O(n) as only one for loop
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]>largest) {
				largest=numbers[i];
			}
			else if(numbers[i]<smallest) {
				smallest=numbers[i];
			}
			
		}
		System.out.println("\n Given array is : "+Arrays.toString(numbers));
		System.out.println("Largest number is : "+largest);
		System.out.println("Smallest number is : "+smallest);
	}
}
