package in.skcoding.multithreading;

public class FirstTask extends Thread{
    public  void run(){
        System.out.printf(" %s $= task ", Thread.currentThread().getName());
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d$ ",i);
        }
        System.out.println("\n first task completed");
    }
}
