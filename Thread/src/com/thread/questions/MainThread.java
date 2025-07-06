package com.thread.questions;

public class MainThread {
 public static void main(String str[]) {
	 
	 PrintThreadNo thread = new PrintThreadNo(1);
	 PrintThreadNo thread2 = new PrintThreadNo(2);
	 
	 Thread t = new Thread(thread);
	 Thread t2 = new Thread(thread2);
	 
	 t.start();
	 t2.start();
	 
	 try {
		 t.join();
		 t2.join();
	 }catch(InterruptedException ex) {
		 System.out.println(ex);
	 }
 }
}
