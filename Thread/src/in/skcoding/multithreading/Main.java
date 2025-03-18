package in.skcoding.multithreading;

//Need of multithreading
public class Main {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        for (int i = 1; i < 1000; i++) {
            System.out.printf("%d$ ",i);
        }
        System.out.println("\n first task completed");

        for (int i = 1; i < 1000; i++) {
            System.out.printf("%d* ",i);
        }
        System.out.println("\n second task completed");

        for (int i = 1; i < 1000; i++) {
            System.out.printf("%d# ",i);
        }
        System.out.println("\n third task completed");

        long endTime = System.currentTimeMillis();
        System.out.printf("Total time take: %d" , endTime);

    }
}