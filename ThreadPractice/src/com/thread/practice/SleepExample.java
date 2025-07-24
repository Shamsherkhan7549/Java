package com.thread.practice;

public class SleepExample {

	public static void main(String[] args) {
		System.out.println("main thread starts");
		
		Thread t = new Thread(()->{
			try {
				Thread.sleep(2000); // sleep for two seconds
			}catch(InterruptedException ex) {
				System.out.println("Exception in t : " + ex);
			}
			
			System.out.println("[" + Thread.currentThread().getName() + "] is running");
		});
		
		t.start();
		
		System.out.println("main thread end");
	}
	
}

/*
 	🔹 1. Thread.sleep(ms) – Pause a Thread
		✅ Purpose:
			-- Temporarily pause the current thread for a specified number of milliseconds.
		
		🧠 Notes:
			-- Does not release lock if inside synchronized block.
			-- Used for delays, simulation, or pacing.
 */
