package in.skcoding.multithreading;

public class HashTask extends Thread {
	public void run() {
		for (int i = 1; i < 1000; i++) {
            System.out.printf("%d# ",i);
        }
		System.out.println("Thread hash name = " + Thread.currentThread().getName());
        System.out.println("\n hash task completed");
	}
}
