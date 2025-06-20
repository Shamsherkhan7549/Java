package com.example;
import java.util.Random;
import java.util.Scanner;

public class FindRandomNum {
	
	public static void main(String[]str) {
		
		Random random = new Random();
		
		int random1 = random.nextInt(10);

		Scanner sc = new Scanner(System.in);
		int i = 1; 
		while(i<=3) {
			System.out.print("Guess The Number : ");
			int userInput = sc.nextInt();
			
			if(random1 == userInput) {
				System.out.println("You won");
				return;
			}else if(random1>userInput) {
				System.out.println("You guess lesser");
			}else{
				System.out.println("You guess bigger");
			}
			
			i++;
		}
		
		System.out.print("You loose");
	}
	
	
}
