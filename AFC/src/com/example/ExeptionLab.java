package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class ExeptionLab {
	
	/*
	 *Create a program with a logic that throws the ArrayIndexOutOfBoundsException
		while accessing elements in an array.[Hint: Use array and loop and try to access the
		element beyond the last index] 
	 */
	
	public static void arrayException()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size of Array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		int i = 0;
		while(i<n) {
			System.out.print("Enter element: ");
			arr[i] = sc.nextInt();
			i++;
		};
		
		System.out.println(Arrays.toString(arr));
		
		try {
			for(int j = 0; j <= n;  j++) {
				System.out.println(arr[j]);
			}
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("exception: " + ex);
			
		}finally {
			System.out.println("Error testing completed");
		}
		
		
		
		
	}
	
public static void main(String str[]) {
	arrayException();
	
}
}
