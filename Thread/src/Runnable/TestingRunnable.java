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
        thread2.start();
        thread3.start();
    }

}
