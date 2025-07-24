package com.test;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {

	public static void main(String[] args) {
		int a[]= {4,5,6,2,1,0,12};
		int temp=0;

		System.out.println("Array Before sorting ::: ");
		for(int k=0;k<a.length;k++)
		{
			System.out.print(" "+a[k]+" ");
		}	
		System.out.println();	
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Arra After sorting ::: ");
		for(int k=0;k<a.length;k++)
		{
			System.out.print(" "+a[k]+" ");
		}
		
		
		/// second solution
		System.out.println();		
		Arrays.sort(a);	
		System.out.println(Arrays.toString(a));
		
		int b[]= {4,5,6,2,1,0,12};
		System.out.println( "Ascending sort");		
		Arrays.sort(b);	
		System.out.println(Arrays.toString(b));
		System.out.println( "descending sort");		
		for(int i=b.length-1;i>=0;i--) {
			System.out.print(" "+b[i]+" ");
		}

	}

}
