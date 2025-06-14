import java.util.Scanner;

public class Factorial{
public static void main(String[] s){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number : " );
	int n = sc.nextInt();
	int fact = 1;
	for(int i = i; i <= n; i++){
		fact *= i;
	}

	System.out.print("factorial of " + n + " is " + fact);

}

}