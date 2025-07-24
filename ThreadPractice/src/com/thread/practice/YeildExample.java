package com.thread.practice;

public class YeildExample {
	public static void main(String str[]) {
		Runnable r = (()->{
			for(int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName()+ " : " + i);
				Thread.yield(); // Hint: Let other thread run
			}
		});
		
		Thread a = new Thread(r, "A");
		Thread b = new Thread(r, "B");
		a.start();
		b.start();
	}
}

/*
 		🔹 3. Thread.yield() – Hint to CPU
 		
			✅ Purpose:
				-- The currently running thread suggests to the CPU that it is willing to pause
				 	and let other threads run.
				 	
			⚠️ Important:
				-- yield() is a suggestion, not a guarantee.

Used for performance tuning, but rarely needed in most apps.
 */
