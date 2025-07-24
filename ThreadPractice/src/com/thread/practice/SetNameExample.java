package com.thread.practice;

class SetNameThread extends Thread{
	public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.println("thread name : " + threadName);
	}
}

public class SetNameExample {
	public static void main(String str[]) {
		SetNameThread snt = new SetNameThread();
		snt.start();
		
		snt.setName("worker-1");
		System.out.println("changed thread name : " + snt.getName());
		
	}
}




/*
  			🔹 1. setName(String) and getName()
				✅ Purpose:
					-- Give a thread a custom name or fetch its name.
					
 */
