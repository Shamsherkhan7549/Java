package Threads;

public class NewThread implements Runnable {    public static void main(String[]args){

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

// Difference between extends and implements the  Threads:-
// The major difference is that when a class extends the Thread class, we cannot extend any other class , but by implementing Runnable interface , it is possible to extend from another to extend from another class as well.
// Ex:- MuClass extendss MainClass implements Runnable
