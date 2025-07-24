package com.thread.practice;

public class JoinExample {

	public static void main(String[] args) {
		Thread t1 = new Thread(()->{
			for(int i = 0; i < 100; i++) {
				System.out.println("t1: "+ i);
			}
		});
		
		Thread t2 = new Thread(()->{
			for(int i = 0; i < 100; i++) {
				System.out.println("t2: "+ i);
			}
		});
		
		Thread t3 = new Thread(()->{
			for(int i = 0; i < 100; i++) {
				System.out.println("t3: "+ i);
			}
		});
		
		t1.start();
		try {
			t1.join();
		}catch(InterruptedException ex) {
			System.out.println("exception in t1's join");
		}
		
		t2.start();
		t3.start();
		
		
		
		
		
		
		
		
		

	}

}


/*
  			🔹 2. Thread.join() – Wait for a Thread to Finish
  			
			✅ Purpose:
				--The current thread waits until the target thread finishes.
			
			🧠 Use Cases:
				-- You want one thread to wait for another to complete before continuing (e.g., for correct result or ordering).
 */
