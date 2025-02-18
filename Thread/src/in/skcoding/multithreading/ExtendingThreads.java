package in.skcoding.multithreading;

//Need of multithreading
public class ExtendingThreads {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        FirstTask t1 = new FirstTask();
        SecondTask t2 = new SecondTask();
        ThirdTask t3 = new ThirdTask();

        System.out.println("First task started");
        t1.start();

        System.out.println("Second task started");
        t2.start();

        System.out.println("Third task started");
        t3.start();

        long endTime = System.currentTimeMillis();
        System.out.printf("Total time take: %d " , endTime);

    }
}