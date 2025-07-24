package com.thread.practice;

public class IsAliveExample {

	public static void main(String[] args) {
		Thread t = new Thread(()-> {
			for(int i = 0; i < 100; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		});
		System.out.println("is t alive before start : " + t.isAlive());
		t.start();
		System.out.println("is t alive after start : " + t.isAlive());
		try{
			Thread.sleep(5000);
		}catch(InterruptedException ex) {
			System.out.println("Thread sleep() exception " + ex);
		};
		System.out.println("is t alive after finish : " + t.isAlive());

	}

}
