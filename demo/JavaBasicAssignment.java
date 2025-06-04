import java.util.Scanner;

public class JavaBasicAssignment{

	/*
		1. Even or Odd Checker 
		Write a program that checks whether a number entered by the user is even or odd using if
		else. 
	*/

	public static void evenOdd(int number){
		if(number%2==0) System.out.print(number+ " is even number");
		else System.out.print(number+ " is odd number");

	}


	/*
		2. Largest of Three Numbers 
		Take three numbers as input and use if-else-if to find and print the largest.
	*/

	public static void largestNumber(int a, int b, int c){
		if(a>b){
			if(a>c){
				System.out.print(a + " is largest");
			}else{
				System.out.print(c + " is largest");
			}

		}else if(b>c){
			System.out.print(b + " is largest");
		}else{
			System.out.print(c + " is largest");
		}	
	}


	/*
		3. Grading System 
		Input student marks (0-100) and print the grade based on: 
		• A: 90-100 
		• B: 80-89 
		• C: 70-79 
		• D: 60-69 
		• F: Below 60 
		Use nested if-else statements. 
	*/


	public static void grade(int marks){
	if (marks >= 0 && marks <= 100) {
        if (marks >= 90) {
            System.out.print('A');
        } else if (marks >= 80) {
            System.out.print('B');
        } else if (marks >= 70) {
            System.out.print('C');
        } else if (marks >= 60) {
            System.out.print('D');
        } else {
            System.out.print('F');
        }
    } else {
        System.out.print("Invalid marks");
    }
	}


	/*
		4. Leap Year Checker 
		Check if a given year is a leap year using if-else. 
	*/

	public static void leapYear(int year){
		  if (year % 4 == 0) {
           		 if (year % 100 == 0) {
                		if (year % 400 == 0) {
                  		  System.out.println(year + " is a leap year.");
               			 } else {
                 		   System.out.println(year + " is not a leap year.");
               			 }
            		} else {
              		  System.out.println(year + " is a leap year.");
           		 }
        	} else {
          	  System.out.println(year + " is not a leap year.");
       		 }

	}
	

	public static void main(String[]args){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number = sc.nextInt();
	evenOdd(number);

	System.out.println();

	System.out.print("Enter a number1: ");
	int number1 = sc.nextInt();

	System.out.print("Enter a number2: ");
	int number2 = sc.nextInt();

	System.out.print("Enter a number3: ");
	int number3 = sc.nextInt();

	largestNumber(number1,number2,number3);
	
	System.out.println();		
	
	System.out.print("Enter Marks: ");
	int marks = sc.nextInt();
	grade(marks);

	System.out.println();
	System.out.print("Enter Year: ");
	int year= sc.nextInt();
	leapYear(year);



	
	

}
}