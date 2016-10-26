package com.threads;
/*
p.290
 */
public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = new Thread();
        Thread.currentThread();
        System.out.println("current thread name is: " + t);
        //schange current thread name
        t.setName("My Thread");
        System.out.println("thread name after name change: " + t);
        try {
            for (int i = 5; i > 0; i--){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            System.out.println("main thread is interrupted");
        }
    }
}
