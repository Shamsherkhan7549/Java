import java.util.Scanner;

public class AgeState{
	public static void main(String[]args){

	/*
		age < 0 || age > 100(Invalid Age)
		age 13-19(teenage)
		20-40(adult age)
		40> old age
	*/


	Scanner scn = new Scanner(System.in);
	System.out.print("Enter Your Age: ");
	int age = scn.nextInt();

	if(age>=0 && age<=100)
		if(age>=13 && age <=19) System.out.print("Teenage");
		else
			if(age>=20 && age<=40) System.out.print("Adult age");
			else System.out.print("Old age");
	else
	System.out.print("Invalid age ");
		
}
}