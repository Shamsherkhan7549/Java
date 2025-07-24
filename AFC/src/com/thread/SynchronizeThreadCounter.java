package com.thread;

public class SynchronizeThreadCounter {
	 static int counter = 0;

	    // Synchronized method to safely increment the counter
	    public synchronized static void increment() {
	        counter++;
	    }

	    public static void main(String[] args) {
	        // Thread 1
	        Thread t1 = new Thread(()->{
	        	for(int i=0;i<100000;i++)
	        	{
	        		increment();
	        	}
	        });

	        // Thread 2
	        Thread t2 = new Thread(() -> {
	            for (int i = 0; i < 100000; i++) {
	                increment();
	            }
	        });

	        // Start both threads
	        t1.start();
	        t2.start();

	        // Wait for both threads to finish
	        try {
	            t1.join();
	            t2.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Print the final counter value
	        System.out.println("Final Counter Value: " + counter);
}

}
