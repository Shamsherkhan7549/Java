package com.thread.practice;

public class DeadLockThread {
	static final Object lock1 = new Object();
	static final Object lock2 = new Object();

	public static void main(String[] args) {
		Thread t1 = new Thread(()->{
			synchronized(lock1) {
				System.out.println("Thread 1 : holding lock1.....");
				
				try {Thread.sleep(1000);}catch(InterruptedException ex) {System.out.println("exception in sleep of lock1 : " + ex);}
			
				System.out.println("Thread 1: Waiting for lock2...");
				synchronized(lock2) {
					System.out.println("Thread 1 : acquire lock2.....");
				}
			
			}
		});
		
		
		Thread t2 = new Thread(()->{
			synchronized(lock2) {
				System.out.println("Thread 2 : holding lock2.....");
				
				try {Thread.sleep(1000);}catch(InterruptedException ex) {System.out.println("exception in sleep of lock2 : " + ex);}
			
				System.out.println("Thread 2: Waiting for lock1...");
				synchronized(lock1) {
					System.out.println("Thread 2 : acquire lock1.....");
				}
			
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		}catch(InterruptedException ex) {
			System.out.println("Exception in join of  t1 or t2 : " + ex);
		}

	}

}


/*
 		🧠 What is a Deadlock?
			-- A deadlock is a situation where two or more threads are waiting
				for each other to release resources, and none of them can proceed.
				
		🧾 Real-life Example:
				-- Imagine two people trying to write using the same two pens:
				-- Person A picks up Pen 1 and waits for Pen 2
				-- Person B picks up Pen 2 and waits for Pen 1
					Neither can proceed — that's a deadlock.
*/
