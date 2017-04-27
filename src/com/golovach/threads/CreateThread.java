package com.golovach.threads;

public class CreateThread {
    public static void main(String[] args) {
        Thread me = Thread.currentThread();
        System.out.println("main: " + me.getName());

        Thread newThread = new Thread(new Runnable() {
            public void run() {
                System.out.println("run(): " + Thread.currentThread().getName() + "\t" +
                       "is Demon? " + Thread.currentThread().isDaemon());
            }
        });
        newThread.start();
    }
}
