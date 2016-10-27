package com.threads.semaphoreDemo;

import java.util.concurrent.Semaphore;

public class IncThread implements Runnable {
    String name;
    Semaphore sem;
    IncThread(Semaphore sem, String name){
        this.sem = sem;
        this.name = name;
        new Thread(this).start();
    }
    public void run(){
        System.out.println("run thread " + name);
        try {
            System.out.println("thread " + name + " waiting access");
            sem.acquire();
            System.out.println("thread " + name + " have access");
            for (int i = 0; i < 5; i++){
                Shared.count++;
                System.out.println(name + ": " + Shared.count);
                Thread.sleep(10);
            }
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("thread " + name + " leave access");
        sem.release();
    }
}
