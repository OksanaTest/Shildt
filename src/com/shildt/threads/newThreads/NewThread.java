package com.shildt.threads.newThreads;
/*
p.292
 */
public class NewThread implements Runnable{
    Thread t;
    NewThread(){
        t = new Thread(this, "thread to demonstrate");
        System.out.println("new thread was created " + t);
        t.start();
    }
    public void run(){
        try {
            for (int i = 5; i > 0; i--){
                System.out.println("new thread: " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("new thread interrupted");
        }
        System.out.println("new thread is finished");
    }
}
