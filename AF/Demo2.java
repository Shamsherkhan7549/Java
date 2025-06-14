import java.util.Scanner;

public class Demo2{

	/*
		wap to take input number from user and print number is Odd or Even.
	*/

	public static void main(String[] str){


	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a number.");
	int number = sc.nextInt();
	
	String numState = number%2==0? "even number" : "odd number";

	System.out.println(number + " is " + numState);
	
}

}

