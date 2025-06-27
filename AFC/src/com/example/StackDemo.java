package com.example;

import java.util.Scanner;
import java.util.Stack;

public class StackDemo {
	public static void main(String str[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		Stack<Integer> numbers = new Stack<>();
		
		System.out.print("Enter size : ");
		n = sc.nextInt();
		
		while(n>0) {
			System.out.print("Do you want to insert element, Enter y for Yes and n for No : ");
			char ch = sc.next().charAt(0);
			if(ch == 'y') {
				System.out.print("Enter number : ");
				int ele = sc.nextInt();
				numbers.push(ele);
			}
			
			
			System.out.print("Do you want to see element, Enter y for Yes and n for No : ");
			char ch2 = sc.next().charAt(0);
			if(ch2 == 'y') {
				System.out.println(numbers.peek());
			}
			
			System.out.print("Do you want to delete element, Enter y for Yes and n for No : ");
			char ch3 = sc.next().charAt(0);
			if(ch3 == 'y') {
				System.out.println(numbers.pop());
				n++;
			}
				
			n--;
		}
		
		System.out.println("Stack is full");
		System.out.println(numbers);
		
		
		
		
	}
}
