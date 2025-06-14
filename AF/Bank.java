import java.util.Scanner;

public class Bank{
	
	/*
		Create a Bank class and declare an instance variable named amount of type
		double.Create parameterized constructor to initialize variable “amount” with
		value 10000.Create two methods withdraw(double withdrawalAmount) and
		deposit(double depositAmount).Calculate withdrawal based on some condition
		(using ternary operator) like If amount is sufficient then “withdraw successful”
		message will be printed on the console and amount should be updated after
		withdraw. Later on, deposit 5000 in the account balance.At the end display total
		balance on the console.
	*/

	double amount;
	double withdrawal;
	double deposite;

	Bank(double amount){
		this.amount = amount;
	}
	
		
	
	void withdrawal(){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Withdrawal Amount: ");
		withdrawal = sc.nextDouble();

		if(withdrawal<=amount){
			amount -= withdrawal;
			System.out.println("Withdrawal Successuflly");

			System.out.print("Do you want to see total ammount y for yes & n for no: ");
			char y = sc.next().charAt(0);
			if(y == 'y'){
				System.out.println("Total Amount: " + amount);
				return;
			};

			System.out.print("Thanks for visiting.");
			return;
		}

		System.out.print("Insufficient Balance");

	}

	
	void deposite(){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Deposite Ammount: ");
		deposite = sc.nextDouble();
		amount += deposite;
		System.out.println("Amount deposite successfully.");
		
		System.out.print("Do you want to see total ammount y for yes & n for no: ");
		char y = sc.next().charAt(0);
		if(y == 'y'){
			System.out.println("Total Amount: " + amount);
			return;
		}
		
		System.out.print("Thanks for visiting.");
		return;
	}
		
	


	public static void main(String str[]){
	
	Bank bank = new Bank(10000);

	bank.withdrawal();
	bank.deposite();


}
}