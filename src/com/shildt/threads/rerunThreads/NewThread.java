package com.shildt.threads.rerunThreads;

/*
312
 */
public class NewThread implements Runnable{
    String name; //thread name
    Thread t;
    boolean suspendFlag;

    NewThread(String name){
        this.name = name;
        t = new Thread(this, name);
        System.out.println("new thread: " + t);
        suspendFlag = false;
        t.start();
    }
    public void run(){
        try {
            for (int i = 15; i > 0; i--){
                System.out.println(name + ": " + i);
                Thread.sleep(2000);
                synchronized (this){
                    while(suspendFlag){
                        wait();
                    }
                }
            }
        }catch (InterruptedException e){
            System.out.println("interruption :( ");
        }
        System.out.println(name + " is finished");
    }
    synchronized void mysuspend(){
        suspendFlag = true;
    }
    synchronized void myresume(){
        suspendFlag = false;
        notify();
    }
}
