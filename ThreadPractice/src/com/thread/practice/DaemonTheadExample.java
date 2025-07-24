package com.thread.practice;

public class DaemonTheadExample {

	public static void main(String[] args) {

		Thread daemonThread = new Thread(()->{
			System.out.println("Daemon thread is running ...");
			while(true) {
			try {
				Thread.sleep(500);
				}catch(InterruptedException ex) {
					System.out.println("Exception in daemonThread : " + ex);
					}
			}
			
		});
		
		daemonThread.setDaemon(true); // must before start
		daemonThread.start();
		
		Thread userThread = new Thread(()->{
			System.out.println("User thread is running ...");
			try {Thread.sleep(2000);}catch(InterruptedException ex) {System.out.println("Exception in userThread : " + ex);}
				
			System.out.println("User thread finishes...");
		
		});
		
		userThread.start();
		

	}

}

/*
  		🧠 What is a Daemon Thread?
			-- A daemon thread is a background thread that provides services to user
				threads (like garbage collection).
			-- When all user (non-daemon) threads finish, the JVM will automatically
			 	terminate all daemon threads — even if they're still running.
			 
	----------------------------------------------------------------------------------------------
			 
			 	📌 Key Points:
			 	
					Feature						Description
					
					Daemon Thread				Background/support thread
					
					Ends when...				All user threads are finished
					
					Cannot be...				Made daemon after starting
					
					Default nature				Threads are user threads by default
					
	-----------------------------------------------------------------------------------------------------
*/
