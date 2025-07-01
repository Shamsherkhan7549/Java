package com.example;

class MyThread extends Thread{
	public void run() {
		for(int i = 1; i <= 10; i++) {
			if(i%2 == 0) {
				try {
					
					Thread.sleep(500);
					
				}catch(Exception err) {
					System.out.println(err);
				}
				
				System.out.println("even : " + i);
			}
		}
	}
}

class MyThread2 extends Thread{
	public void run() {
		for(int i = 1; i <= 10; i++) {
			if(i%2 == 1) {
				try {
					
					Thread.sleep(500);
					
				}catch(Exception err) {
					System.out.println(err);
				}
				
				System.out.println(" odd : " + i);
			}
		}
	}
}

public class ThreadDemo {
public static void main(String str[]) {
	System.out.println("thred");
	
	MyThread t  = new MyThread();
	t.start();
	
	MyThread2 t2  = new MyThread2();
	t2.start();

	
}
}
