package com.threads.newThreadsExtendsThreadClass;
/*
p.294
 */
public class NewThread extends Thread{
    NewThread(){
        //create new thread
        super("thread to demonstration");
        System.out.println("new thread: " + this);
        start();
    }
    public void run(){
        try {
            for (int i = 5; i > 0; i--){
                System.out.println("new thread: " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("new thread in interrupted ");
        }
        System.out.println("new thread is finished");
    }
}
