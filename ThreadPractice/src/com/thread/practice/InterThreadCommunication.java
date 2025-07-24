package com.thread.practice;

class SharedResources{
	int data;
	boolean isValue = false;
	
	public synchronized void produce(int value) {
		while(isValue) {
			try {
				wait();
			}catch(InterruptedException ex) {
				System.out.println("exception in produce : " + ex);
			}
		}
		
		data = value;
		System.out.println("produce : " + data);
		isValue = true;
		notify();
	}
	
	public synchronized void consume(int value) {
		while(!isValue) {
			try {
				wait();
			}catch(InterruptedException ex) {
				System.out.println("exception in consume : " + ex);
			}
		}
		
		data = value;
		System.out.println("consume : " + data);
		isValue = false;
		notify();
	}
}
public class InterThreadCommunication {

	public static void main(String[] args) {
		SharedResources sr = new SharedResources();
		
		Thread consumer = new Thread(()->{
			for(int i = 1; i <= 5; i++) {
				sr.consume(i);
			}
		}, "consumer");
		
		Thread producer = new Thread(()->{
			for(int i = 1; i <= 5; i++) {
				sr.produce(i);
			}
		}, "producer");
		
		producer.start();
		consumer.start();
		
		try {
			producer.join();
			consumer.join();
		}catch(InterruptedException ex) {
			System.out.println("Exception in joining : " + ex);
		}
		
		

	}

}

/*
 		🔥 Thread Lecture 6: Inter-Thread Communication
 				-- a crucial concept when threads need to coordinate with each other.
 				
		🧠 Why Inter-Thread Communication?
			-- Sometimes, one thread needs to wait for another to complete some task.
			 Just using sleep() is not safe or efficient. That's where wait(), notify(),
			  and notifyAll() come in.
			  
		Note:
			-- wait() and notify() must only be called inside synchronized context 
			(i.e., within a synchronized method or block). Otherwise, it will throw a 
			java.lang.IllegalMonitorStateException.
			
	-------------------------------------------------------------------------------------------------  
		✅ Key Methods
		
			Method					Description
			
			wait()					Releases the lock and waits until another thread calls
			 						notify() or notifyAll() on the same object.
			 						
			notify()				Wakes up one waiting thread.
			
			notifyAll()				Wakes up all waiting threads.

	----------------------------------------------------------------------------------------------
*/
