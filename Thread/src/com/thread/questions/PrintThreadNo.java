package com.thread.questions;

public class PrintThreadNo implements Runnable{
		public void run() {
			for(int i = 0; i < 10; i++) {
				System.out.printf("(%d) %s Hello from Thread- %d \n",i+1,Thread.currentThread().getName(), threadcount);
			}
		}
		
		final int threadcount;

		public PrintThreadNo(int threadcount) {
			super();
			this.threadcount = threadcount;
		}
}
