package Threads;

public class NewThread implements Runnable {

    public static void main(String[]args){

        NewThread newThread = new NewThread();
        Thread thread = new Thread(newThread);
        thread.start();
        //newThread.start();
        System.out.println("This is running outside thread");

    }

    public void run(){
        System.out.println("This is running inside thread");
    }
}
