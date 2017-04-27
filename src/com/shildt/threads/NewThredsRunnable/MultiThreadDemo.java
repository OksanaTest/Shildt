package com.shildt.threads.newThredsRunnable;

public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread("First");
        new NewThread("Second");
        new NewThread("Third");
        try {
            Thread.sleep(10000);
        }catch (InterruptedException e){
            System.out.println("main thread is interrupted");
        }
        System.out.println("main thread is finished");
    }
}
