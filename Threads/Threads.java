package Threads;

class MyThread extends Thread{
    public void run(){
        System.out.println("This a running");
    }
}

class MyRunnalble implements Runnable{
    public void run(){
        System.out.println("This is running2");
    }
}

public class Threads {
    public  static void main(String [] args){
        System.out.println("This is Threads");

        MyThread thread = new MyThread();
        thread.start(); //Thread start


        MyRunnalble myRunnable = new MyRunnalble();
        Thread thread2 = new Thread(myRunnable);
        thread2.start(); //Thread start

    }
}

// The run() method is the only method that gets executed when a thread starts, but greet() is not being called from run().

// A thread in Java is a light weighted process, or we can say the smallest part of the process that allows a program to operate/execute more efficiently by running multiple tasks simultaneously(or concurrent or parallel) within the same application.

// In order to perform complicated tasks in the background , We use the Thread concept in java. All the tasks are executed without affecting the main program.

// In a program/process, all the threads have their own separate path for execution, so, each thread of a process is independent.

// Another benefit of using Threads is that if a thread gets an exception or error at the time of its execution, it does not affect execution of the other threads.

// When multiple threads are executed parallel at the same time, this process is know as Multithreading

//Key Points about Threads in Java:
//Thread Class: Java provides a built-in Thread class to work with threads. You can create a thread in two primary ways:
//Extending the Thread class: By subclassing Thread and overriding its run() method.
//Implementing the Runnable interface: By creating a class that implements the Runnable interface and providing an implementation for the run() method.

// Thread Methods:
//start(): Starts the thread and calls the run() method in a separate thread of execution.
//sleep(long millis): Causes the current thread to sleep (pause execution) for a specified period.
//join(): Makes the current thread wait until the thread it is called on has finished.
//getName(), setName(): Retrieve or set the name of the thread.
//Concurrency: Java provides several tools to manage threads, such as:

//Synchronization: Ensures that only one thread can access a particular block of code at a time, preventing issues like race conditions.
//Executor Framework: A higher-level API for managing and controlling thread execution.
//Thread Pool: Allows efficient reuse of threads.

// Life Cycle :- In Java, a thread's life cycle refers to the various states that a thread goes through during its existence. These states define how a thread moves from being created to termination, and understanding this cycle is essential for managing thread behavior properly.

//The thread life cycle can be broken down into the following states:

// 1. New (Born)
// A thread is in the new state when it is created but not yet started.
// At this point, the thread has been instantiated, but the start() method has not been called.
// Thread t = new Thread();  // Thread is in the "New" state

//2. Runnable
// The thread moves to the runnable state when the start() method is called. This means the thread is eligible for running but isn't necessarily running yet (since threads are managed by the thread scheduler).
// A thread in the runnable state could be running or waiting to be assigned CPU time.
// t.start();  // Thread moves to "Runnable" state

// 3. Blocked
// A thread enters the blocked state when it is waiting to acquire a lock (i.e., waiting for some resource that is currently held by another thread).
// This often happens when the thread needs access to a synchronized block or method, and it cannot proceed until the lock is released by the other thread.
// Example: If one thread holds a lock on a resource, and another thread tries to access it using a synchronized block, the second thread will be blocked until the lock is available.

// 4. Waiting
// A thread enters the waiting state when it is waiting indefinitely for another thread to perform a specific action (e.g., calling notify() or notifyAll()).
// This is usually done using methods like wait(), join(), or park().

// synchronized (someObject) {
//    someObject.wait();  // Thread enters the "Waiting" state
//}

// 5. Timed Waiting
// A thread enters the timed waiting state when it is waiting for a specified amount of time before it can return to the runnable state.
// Common methods that cause timed waiting include:
//sleep(long millis)
//join(long millis)
//wait(long millis)
// t.sleep(1000);  // Thread will sleep for 1 second (timed waiting)

// 6. Terminated (Dead)
// A thread is in the terminated state once it has completed its execution or when it is explicitly stopped.
// After a thread has finished executing its run() method, it enters the terminated state. It cannot be restarted.

// New --> Runnable --> Running --> Waiting/Blocked --> Terminated






