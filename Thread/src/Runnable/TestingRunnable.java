package Runnable;

public class TestingRunnable{
    public  static void main(String [] args){
        PrintTask printTask = new PrintTask('$');
        PrintTask printTask2 = new PrintTask('*');
        PrintTask printTask3 = new PrintTask('#');

        Thread thread = new Thread(printTask);
        Thread thread2 = new Thread(printTask2);
        Thread thread3 = new Thread(printTask3);

        thread.start();
        thread.setPriority(Thread.MIN_PRIORITY);
        thread2.start();
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread3.start();
        thread3.setPriority(Thread.MAX_PRIORITY);
    }

}
