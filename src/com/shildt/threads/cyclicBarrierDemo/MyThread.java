package com.shildt.threads.cyclicBarrierDemo;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MyThread implements Runnable {
    CyclicBarrier cyclicBarrier;
    String name;
    MyThread(CyclicBarrier cyclicBarrier, String name){
        this.cyclicBarrier = cyclicBarrier;
        this.name = name;
        new Thread(this).start();
    }
    public void run(){
        System.out.println(name);
        try {
            cyclicBarrier.await();
        }catch (BrokenBarrierException e){
            System.out.println(e);
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
