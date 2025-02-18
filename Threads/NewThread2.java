package Threads;

// Do it on runnable

class Example2  implements Runnable{

    public  void greet(){
        System.out.println("Hello India!");
    }

    public  void run(){
        try{
            greet();
            System.out.println("Thread-2 " + Thread.currentThread().getId() + " is running.");
        } catch (Exception e) {
            System.out.println("Error Caught");
        }
    }
}

class  Example extends Thread{

    public void run(){
        try {

            System.out.println("Thread-1 " + Thread.currentThread().getId() + " is running");

        }catch (Exception e){
            System.out.println("Error caught");
        }
    }
}
public class NewThread2 {
    public static void main (String[] args){
        //Extends
        int n = 5;
        for(int i = 0; i < n; i++){
            Example example = new Example();
//            example.start();
        }

        //Runnable
        int m = 4;
        for(int i = 0; i < m; i++){
           Example2 example = new Example2();
           Thread thread = new Thread(example);
             thread.start();

        }
    }
}
