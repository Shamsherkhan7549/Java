import java.util.Scanner;

public class SwitchCaseDemo{
	
	public static void main(String[]args){
	/*
		take character an input from user and check user is vowel or consonent using switch_case.
	*/

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter Character a-z : ");

	char ch = sc.next().charAt(0);
	
	switch(ch){
	
	case 'a': System.out.print(ch + " is vowel");
	break;

	case 'e': System.out.print(ch + " is vowel");
	break;

	case 'i': System.out.print(ch + " is vowel");
	break;

	case 'o': System.out.print(ch + " is vowel");
	break;

	case 'u': System.out.print(ch + " is vowel");
	break;
	
	default: System.out.print(ch + " is constant");

	}

}

}