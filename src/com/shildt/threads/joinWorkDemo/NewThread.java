package com.shildt.threads.joinWorkDemo;

/*
297
 */
public class NewThread implements Runnable{
    String name;
    Thread t;
    NewThread(String name){
        this.name = name;
        t = new Thread(this, name);
        System.out.println("new thread " + t);
        t.start();
    }
    public void run(){
        try {
            for (int i = 5; i > 0; i--){
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(name + " is interrupted");
        }
    }
}
