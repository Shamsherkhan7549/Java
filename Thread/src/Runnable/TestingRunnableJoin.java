package Runnable;

public class TestingRunnableJoin{
    public  static void main(String [] args){
        PrintTask printTask = new PrintTask('$');
        PrintTask printTask2 = new PrintTask('*');
        PrintTask printTask3 = new PrintTask('#');

        Thread thread = new Thread(printTask);
        Thread thread2 = new Thread(printTask2);
        Thread thread3 = new Thread(printTask3);

        thread.start();

        thread2.start();
        
        try {
        	thread2.join();
        }catch(InterruptedException ex) {
        	System.out.println(ex);
        }

        thread3.start();

    }

}
