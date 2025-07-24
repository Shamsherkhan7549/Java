package com.thread.practice;

public class SetPriorityExample {

	public static void main(String[] args) {

		Thread t1 = new Thread(()->{
			for(int i = 0; i < 10; i++) {
				System.out.print(" t1: " + i + " ");
			}
			System.out.println();
		});
		
		Thread t2 = new Thread(()->{
			for(int i = 0; i < 10; i++) {
				System.out.print(" t2: " + i + " ");
			}
			System.out.println();
		});
		
		Thread t3 = new Thread(()->{
			for(int i = 0; i < 10; i++) {
				System.out.print(" t3: " + i);
			}
			System.out.println();
		});
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.setPriority(Thread.MAX_PRIORITY); //<5
		t2.setPriority(Thread.MIN_PRIORITY); // 5
		t3.setPriority(Thread.NORM_PRIORITY); // >5
		
		

	}

}


/*
  				🔹 3. setPriority(int) – Control Execution Preference
					✅ Priority Range:
						-- Java thread priority ranges from 1 to 10.
				
						Constant							Value
						
						Thread.MIN_PRIORITY					1
						
						Thread.NORM_PRIORITY				5 (default)
						
						Thread.MAX_PRIORITY					10
						
				---------------------------------------------------------------------------------------
				⚠️ Important:
				
					-- Priority is only a suggestion to the OS/CPU scheduler.
					
					-- Not guaranteed to run in that order.


 */
