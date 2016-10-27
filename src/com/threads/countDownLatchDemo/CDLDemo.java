package com.threads.countDownLatchDemo;

import java.util.concurrent.CountDownLatch;

public class CDLDemo {
    public static void main(String[] args) {
        CountDownLatch cdl = new CountDownLatch(5);
        System.out.println("run thread to execute");
        new MyThread(cdl);
        try {
            cdl.await();
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("thread is finished");
    }

}
