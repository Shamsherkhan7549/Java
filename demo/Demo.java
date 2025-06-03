import java.util.Scanner;
public class Demo{
	
	public static void main(String[]str){
	//System.out.print("hello java");

	byte b;
	b = 127;
	System.out.println(b);

	short s = 128;
	short s2 = 32767;
	
	System.out.println(s2);

	int i = 32768;
	System.out.println(i);

	float f = 32.34f;
	System.out.println(f);

	double d = 32.34;
	System.out.println(d);

	long l = 32768;
	System.out.println(l);
	
	
	//Type casting:-

	//Explicit conversion
	int i2 = 129; 

	byte b2 = (byte)i2;

	System.out.println(b2);

	//Implicit conversion
	char ch = 'B';
	int i3 = ch;
	System.out.println(i3);

	//Explicit type casting
	int i4 = 67;
	char ch2 = (char)i4;
	System.out.println(ch2);


	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the message");
	String msg = sc.nextLine();
	System.out.println("Message: " + msg);

	System.out.println("Enter a number");
	int number = sc.nextInt();
	System.out.println("Number: " +number);

	// Process
	/* wap to get 3 numbers from user and calculate the averge and print the result. */

	Scanner scn = new Scanner(System.in);
	System.out.println("Enter number1");
	int num1 = scn.nextInt();

	System.out.println("Enter number2");
	int num2 = scn.nextInt();

	System.out.println("Enter number3");
	int num3 = scn.nextInt();

	float avg = (num1+num2+num3)/3f;  // process

	System.out.println("Average of all numbers = " + avg);

	// explicit conversion and process

	int num4 = 100;
	double d2 = 35.23;
	int sum = (int)(num4+d2);
	System.out.println("sum " + sum);


	

	
		

}

}
