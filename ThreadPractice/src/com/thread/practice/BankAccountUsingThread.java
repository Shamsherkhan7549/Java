package com.thread.practice;

class Bank{
	 int  balance;

	public Bank(int balance) {
		this.balance = balance;
	}
	
	
	public synchronized void deposit(int deposit) {
		balance += deposit;
		System.out.println(Thread.currentThread().getName() + " deposited: " + deposit + " | Balance: " + balance);
	}
	
	public synchronized void withdraw(int withdraw) {
		if(balance > withdraw) {
			balance -= withdraw;
			 System.out.println(Thread.currentThread().getName() + " withdrew: " + withdraw + " | Balance: " + balance);
			return;
		}
		
        System.out.println(Thread.currentThread().getName() + " insufficient balance for withdraw | Balance: " + balance);
	}
	
}

public class BankAccountUsingThread {

	public static void main(String[] args) {
		Bank user = new Bank(1000);

		Thread t1 = new Thread(()->{
			for(int i = 1; i <= 5; i++ ) 
				user.deposit(1000);
			try {
					Thread.sleep(100);
				}catch(InterruptedException ex) {
					System.out.println("exception in t1 sleep() : " + ex);
				};
		},"depositer");
		
		Thread t2 = new Thread(()->{
			for(int i = 1; i <= 5; i++ ) 
				user.withdraw(500);
			try {
				Thread.sleep(150);
			}catch(InterruptedException ex) {
				System.out.println("exception in t1 sleep() : " + ex);
			};
		},"withdrawer");
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		}catch(InterruptedException ex) {
			System.out.println("exception in join() of t1 or t2");
		}
		
		System.out.println("Balance : " + user.balance);
	}

}


/*
  		🧪 Practice Task (Optional)
			Create a BankAccount class with:
			
			1. A balance field
			
			2. deposit() and withdraw() methods
			
			3. Two threads: one deposits ₹1000 five times, another withdraws ₹500 five times
*/
