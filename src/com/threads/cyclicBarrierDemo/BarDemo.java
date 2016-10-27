package com.threads.cyclicBarrierDemo;

import java.util.concurrent.CyclicBarrier;

/*
1017
 */
public class BarDemo {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3, new BarAction());
        System.out.println("threads run");
        new MyThread(cb, "A");
        new MyThread(cb, "B");
        new MyThread(cb, "C");
    }
}
