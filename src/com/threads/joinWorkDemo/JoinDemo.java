package com.threads.joinWorkDemo;

public class JoinDemo {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("First");
        NewThread ob2 = new NewThread("Second");
        NewThread ob3 = new NewThread("Third");
        System.out.println("First thread have been started: " +
        ob1.t.isAlive());
        System.out.println("Second thread have been started: " +
        ob2.t.isAlive());
        System.out.println("Third thread have been started: " +
        ob3.t.isAlive());
        //wait while threads finish work
        try {
            System.out.println("waiting for threads work finished");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch (InterruptedException e) {
            System.out.println("main thread was interrupted");
        }
        System.out.println("first thread is started: " +
        ob1.t.isAlive());
        System.out.println("second thread is started: " +
        ob2.t.isAlive());
        System.out.println("third thread is started: " +
        ob3.t.isAlive());
        System.out.println("main thread is finished");
    }
}
