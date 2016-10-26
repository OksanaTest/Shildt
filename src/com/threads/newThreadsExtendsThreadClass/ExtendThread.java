package com.threads.newThreadsExtendsThreadClass;

public class ExtendThread {
    public static void main(String[] args) {
        new NewThread(); //create new thread
        try {
            for (int i = 5; i > 0; i--){
                System.out.println("main thread: " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("main thread is interrupted");
        }
        System.out.println("main thread is finished");
    }
}
