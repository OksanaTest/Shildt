package com.shildt.threads.rerunThreads;

public class SuspendResume {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("one");
        NewThread ob2 = new NewThread("two");
        try {
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("delay thread one");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("rerun thread one");
            ob2.mysuspend();
            System.out.println("delay thread two");
            Thread.sleep(1000);
            ob2.myresume();
            System.out.println("rerun thread two");
        }catch (InterruptedException e){
            System.out.println("main thread have been interrupted");
        }
        try {
            System.out.println("waiting to threads finish work");
            ob1.t.join();
            ob2.t.join();
        }catch (InterruptedException e){
            System.out.println("main thread have been interrupted");
        }
        System.out.println("main thread have been finished");
    }
}
