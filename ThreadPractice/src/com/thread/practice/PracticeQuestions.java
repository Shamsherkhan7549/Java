package com.thread.practice;

public class PracticeQuestions {
	public static void main(String str[]) {
		System.out.println("Main started");
		
		try {
			Thread.currentThread().sleep(5000);
		}catch(InterruptedException ex) {
			System.out.println("Exception wait(ms) of main : ");
		}
		
		Thread t1 = new Thread(()->{
			for(int i = 0; i < 5; i++) {
				System.out.print(" T1 : " + i + " ");
			}
			System.out.println();
		});
		
		
		
		Thread t2 = new Thread(()->{
			for(char i = 'A'; i <= 'E'; i++) {
				System.out.print(" T2 : " + i + " ");
				Thread.yield();
			}
			System.out.println();
		});
		
		t1.start();
		
		try {
			t1.join();
		}catch(InterruptedException ex) {
			System.out.println("Exception in t1 join: " + ex);
		}
		
		t2.start();
		
		try {
			t2.join();
		}catch(InterruptedException ex) {
			System.out.println("Exception in t1 join: " + ex);
		}
		
		System.out.println("Main ended");
	}
	
}
