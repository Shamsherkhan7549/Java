package com.thread.practice;

public class ThreadLifeCycleDemo {

	public static void main(String[] args) {
		// Lambda Expression
		Thread t1 = new Thread(()->{
			System.out.println("[" + Thread.currentThread().getName() + "]" + " is running");
			try {
				Thread.sleep(3000);
			}catch(InterruptedException ie) {
				System.out.println("t1 exception : " + ie);
			}
		}); 
		
		System.out.println("State after creation : " + t1.getState());  // new 
		
		t1.start();
		System.out.println("State after calling thread start() : " + t1.getState()); // runnable
		
		try {
            Thread.sleep(100); // Give thread time to start
        } catch (Exception e) {}
		
		   System.out.println("State during sleep: " + t1.getState()); // TIMED_WAITING
		   
		   try {
			   t1.join();
		   }catch(Exception ex) {
			   System.out.println(ex);
		   }
		   
		   System.out.println("State after finish : " + t1.getState());  // Terminated
		   
		   Runnable r = () -> System.out.println("Runnable interface...");
		   Thread t = new Thread(()->{
			   System.out.println("Runnable interface...");
		   });
		  
	}

}


/*
 	.

			🔁 Thread Lifecycle Diagram
			
					NEW → RUNNABLE → RUNNING → TERMINATED
					         ↓
					      BLOCKED
					         ↓
					      WAITING / TIMED_WAITING
					      
			  🔹 1. NEW State
					-- A thread is created but not started.
					-- At this point, the thread has no call stack.
					Thread t = new Thread();
					
				🔹 2. RUNNABLE State
					-- When start() is called:
					-- Thread is ready to run, but not running yet.
					-- It waits in the runnable pool for the CPU to schedule it.
					t.start();
					
				🔹 3. RUNNING State
					-- The thread is currently executing its run() method.
					-- Only one thread per CPU core can be in this state at any time.
					
				🔹 4. BLOCKED State
					-- A thread is waiting to acquire a lock to enter a synchronized block.
					synchronized(obj) {
					    // critical section
					}
					
				🔹 5. WAITING State
					-- A thread is waiting indefinitely for another thread to perform a task.
					-- It moves to this state when:
					-- join() is called and the target thread hasn't finished.
					-- Object.wait() is used without a timeout.
					-- Must be manually woken up with notify() or join() ending.
					
				🔹 6. TIMED_WAITING State
					-- A thread waits for a specified amount of time.
					-- Enters this state by calling:
					-- Thread.sleep(ms)
					-- join(ms)
					-- wait(ms)
					-- Lock.tryLock(timeout)
					-- Thread.onSpinWait()
					
				🔹 7. TERMINATED (DEAD) State
					-- Thread has finished execution (run method ends or exception occurs).
					-- sOnce a thread is terminated, it cannot be restarted.






					
 */
