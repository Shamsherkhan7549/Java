
package com.example;
import java.util.Scanner;
public class ErrorExample {
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter your name");
		try {
			String name  = null;
			
			if(name.length()>2) {
				System.out.println(name);
			}
			
		}catch(NullPointerException ex){
			System.out.println("Enter the value " + ex);
		}finally {
			System.out.println("Testing completed");
		}
		
		
		System.out.println("Enter number");
		String str = scanner.next();
		
		try {
			
			int num = Integer.parseInt(str);
			System.out.print(num);
			
		}catch(NumberFormatException ex) {
			System.out.println("This is not a number: " + ex);
		}finally {
			System.out.println("number testing completed");
		}
		
		
		int arr[] = {1,2,3,4,5};
		
		try {
			
			for(int i = 0; i <= arr.length; i++) {
				System.out.println(arr[i]);
			}
			
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Conditional problem " + ex);
		}finally {
			System.out.println("Array testing completed");
		}
		
		
		System.out.println("Enter num1");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter num2");
		int num2 = scanner.nextInt();
		
		try {
		double div = num1/num2;
		System.out.println(div);
		}catch(ArithmeticException ex) {
			System.out.println("devide by zero is not valid " + ex);
		}finally {
			System.out.println("Artimetic testing completed");
		}
		
		System.out.println("Assignment Completed");
		
		
	}
}
