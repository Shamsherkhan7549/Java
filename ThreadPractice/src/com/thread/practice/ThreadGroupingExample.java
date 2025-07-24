package com.thread.practice;

public class ThreadGroupingExample {

	public static void main(String[] args) {
		//step1 : Create ThreadGroup 
		ThreadGroup group = new ThreadGroup("MyGroup");
		
		//step2: Create Thread in that group
		Thread t1 = new Thread(group, ()->{
			System.out.println(Thread.currentThread().getName() + " is running ...");
			  try { Thread.sleep(500); } catch (InterruptedException e) {}
		}, "Worker-1");
		
		Thread t2 = new Thread(group,()->{
			System.out.println(Thread.currentThread().getName() + " is running ...");
			  try { Thread.sleep(500); } catch (InterruptedException e) {}
		},"Worker-2");
		
		t1.start();
		t2.start();
		
		// step3: Group info
		System.out.println("Active thread count : " + group.activeCount());
		System.out.println("Thread group name : " + group.getName());
		
		//step4: list group detail
		group.list();

	}

}


/*
  		🧠 What is a Thread Group?
			A ThreadGroup in Java is used to group multiple threads together.
			This allows you to manage multiple threads as a single unit — like
			interrupting or checking the status of all threads in a group.
			
			✅ Why Use Thread Groups?
				-- To manage a collection of threads together.
				-- To set a common priority or interrupt them together.
				-- To organize threads logically.
*/

