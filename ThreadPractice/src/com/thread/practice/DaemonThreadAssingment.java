package com.thread.practice;

import java.time.LocalTime;

public class DaemonThreadAssingment {

	public static void main(String[] args) {

		Thread helperThread = new Thread(()->{
			System.out.println("Daemon Thread is running ....");
			while(true){
				System.out.println("current time: " + LocalTime.now());
			try {
				Thread.sleep(500);
			}catch(InterruptedException ex) {
				System.out.println("Exception in daemon thead sleep : " + ex);
				System.out.println("Daemon Thread finished");
			}
			}
			
			
			
		},"timerThread");
		
		helperThread.setDaemon(true); // must set before start
		helperThread.start();
		
		Thread userThread = new Thread(()->{
			System.out.println("User Thread is running ...");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException ex) {
				System.out.println("Exception in userThread sleep() : " + ex);
			}
			
			   System.out.println("✅ User thread finished.");
		}, "userThread");
		
		userThread.start();

	}

}

/*
  	Create a daemon thread that prints system time every second, and a user thread that runs for 5 seconds.
	See what happens when the user thread ends.
 */
