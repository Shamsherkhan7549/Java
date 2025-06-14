import java.util.Scanner;

public class FactorialWhileLoop{

	public static void main(String[] str){
	
	Scanner scn = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number = scn.nextInt();

	int factorial = 1;
	
	while(number>=1){
		factorial *= number;
		number--;
	}

	System.out.print(factorial);

}
}