package com.threads.semaphoreDemoRewiriteExistTasks;

import java.util.concurrent.Semaphore;

/*
1012
 */
public class QueueSomeSem {
    int n;
    static Semaphore semCon = new Semaphore(0);
    static Semaphore semProd = new Semaphore(1);
    void get(){
        try {
            semCon.acquire();
        }catch (InterruptedException e){
            System.out.println("interruption");
        }
        System.out.println("receive " + n);
        semProd.release();
    }
    void put(int n){
        try {
            semProd.acquire();
        }catch (InterruptedException e){
            System.out.println("interruption");
        }
        this.n = n;
        System.out.println("send " + n);
        semCon.release();
    }
}
