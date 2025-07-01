package com.example;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockCounter {
    static int counter = 0;
    static Lock lock = new ReentrantLock();

    public static void increment() {
        lock.lock(); // Acquire the lock
        try {
            counter++;
        } finally {
           lock.unlock(); // Always release the lock in finally block
        }
    }
    public static void incr()
    {
   	 lock.lock();
   	 try
   	 {
   	 for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
   	 }
       finally {
    	   lock.unlock();
	}
   		 
   	
    }
   

    public static void main(String[] args) {
        // Thread 1
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                increment();
            }
        });

        // Thread 2
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                increment();
            }
        });
        
        Thread t3 = new Thread(()->{
        	incr();
        });

        // Start the threads
        t1.start();
        t2.start();
        t3.start();

        // Wait for threads to complete
        try {
        	 t3.join();
            t1.join();
            t2.join();
           
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        
        
        

        // Display final counter value
        System.out.println("Final Counter with Lock: " + counter);
}
}
