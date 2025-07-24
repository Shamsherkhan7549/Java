package com.thread.practice;

class A{}
class B{}

public class DeadLockAssingment {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		Thread t1 = new Thread(()->{
			synchronized(a) {
				System.out.println("Thread t1 : holding a ......." );
				
				try {Thread.sleep(2000);}catch(InterruptedException ex) {System.out.println("Exception in a sleep() : " + ex);};
				
				System.out.println("Thread t1 is waiting for b...");
				synchronized(b) {
					System.out.println("Thread t1  is acquiring b...");
				}
			}
		});
		
		Thread t2 = new Thread(()->{
			synchronized(b) {
				System.out.println("Thread t2 : holding b ......." );
				
				try {Thread.sleep(2000);}catch(InterruptedException ex) {System.out.println("Exception in b sleep() : " + ex);};
				
				System.out.println("Thread t2 is waiting for a...");
				synchronized(a) {
					System.out.println("Thread t2  is acquiring a...");
				}
				
				
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		}catch(InterruptedException ex) {
			System.out.println("Exception in join() of t1 or t2 : " + ex);
		}
		
		

	}

}

/*
  		🔥 🧪 Practice Task: Deadlock Simulation
				✅ Create two objects and two threads.
				
				✅ Each thread should:
				
				Try to acquire two locks (lock1 and lock2)
				
				But in reverse order, which leads to a deadlock.
*/
