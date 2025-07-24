package com.thread.practice;

class MyRunnable implements Runnable{
	public void run () {
		System.out.println("MyRunnable : " + "[" + Thread.currentThread().getName() + "]");
		System.out.println("Runnable is running");
	}
}

public class MyThread extends Thread{
	
	public void run() {
		System.out.println("MyThread : " + "[" + Thread.currentThread().getName() + "]");
		System.out.println("MyThread is running");
	}
	
	public static void main(String str[]) {
		

		
		//creating object of thread
		MyThread mt = new MyThread(); // new State
		mt.start(); // Runnable -> Running
		mt.setName("Worker-1");
		
		Thread mr = new Thread(new MyRunnable());
		mr.start();
		mr.setName("RunableWorker-2");
		
		mr.run(); // it is just a method call not a thread call

		System.out.println("main : " + "[" + Thread.currentThread().getName() + "]");
		
		
		
		
		Thread t1 = new Thread(()->{
			for(int i = 0; i < 5; i++) {
				System.out.println("t1 : " +i);
			}
		});
		
		Thread t2 = new Thread(()->{
			for(int i = 0; i < 5; i++) {
				System.out.println("t2 : " + i);
			}
		});
		
	
		t1.start();
//		System.out.println("is t2 alive : " + t2.isAlive());
		try{
			t1.join();
			
		}catch(Exception ex) {
			System.out.println(ex);
		}
		
		t2.start();
		
		System.out.println("is t2 alive : " + t2.isAlive());
		
	
		
		
	}
}

/*
 		-- A thread is a lightweight independent path of execution within a program. In Java, every application has at
 		 least one thread — the main thread.

		-- Java supports multithreading, which means executing two or more threads concurrently to maximize CPU usage.
		
		--------------------------------------------------------------------------------------------------------------------
		🔸 Why Use Threads?
		
			Reason							Description
			
			Efficiency						Better CPU utilization
			
			Faster Execution				Tasks can be parallelized
			
			Responsiveness					UI remains responsive (e.g., in games, GUIs)
			
			Resource Sharing				Threads of the same process share memory
			
		--------------------------------------------------------------------------------------------------------------
			
			Aspect									Single Thread									Multithreading
			
			Execution								One task at a time								Multiple tasks at the same time
			
			CPU Utilization							Less efficient									More efficient
			
			Example									Reading a file first, then writing to it		Reading and writing together
			
		----------------------------------------------------------------------------------------------------------------------------
		
		🔸 Thread Lifecycle
		
				1. New – Thread is created but not started.
				
				2. Runnable – start() is called, ready to run.
				
				3. Running – Thread is executing.
				
				4. Blocked/Waiting – Waiting for a resource.
				
				5. Terminated – Thread is completed or stopped.
				
		-------------------------------------------------------------------------------------------------------------------------------------
		
		
		🔸 Key Methods in Thread Class
				Method					Description
				
				start()					Starts the thread
				
				run()					Code that runs inside the thread
				
				sleep(ms)				Pause thread for given time
				
				join()					Waits for thread to die
				
				isAlive()				Checks if thread is still running
				
				setName()				Set thread name
				
				getName()				Get thread name
		
 */
