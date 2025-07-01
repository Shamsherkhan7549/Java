package in.skcoding.multithreading;

public class StarTask extends Thread{
	@Override
	public void run() {
		for (int i = 1; i < 1000; i++) {
            System.out.printf("%d* ",i);
            
        }
		System.out.println("Thread star name = " + Thread.currentThread().getName());
        System.out.println("\n star task completed");
	}
}
