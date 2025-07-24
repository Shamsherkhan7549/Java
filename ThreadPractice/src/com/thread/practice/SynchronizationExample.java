package com.thread.practice;

public class SynchronizationExample {
	static int count = 0;
	public  void increment() {
		synchronized (this) {
		for(int i = 1; i <= 10000; i++ )
			count++;
		}
		;
	}

	public static void main(String[] args) {
		SynchronizationExample se = new SynchronizationExample();
		Thread t1 = new Thread(()->{
			se.increment();
			System.out.println(count);
		});

		Thread t2 = new Thread(()->{
			se.increment();
			System.out.println(count);
		});
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		}catch(InterruptedException ex) {
			System.out.println("exception in join() of t1");
		}
		
//		try {
//			t2.join();
//		}catch(InterruptedException ex) {
//			System.out.println("exception in join() of t2");
//		}
		
		System.out.println("count = " + count);
	}

}

/*
 			🔥 Problem: What if 2 threads access the same data at the same time?
					-- This causes a Race Condition — where the output depends on timing, not logic.
					
			✅ Solution: Use synchronized to Lock Critical Sections
					🧠 What is synchronized?					
						-- Makes a method/block atomic						
						-- Only one thread can access it at a time
						-- Prevents race conditions
 */
