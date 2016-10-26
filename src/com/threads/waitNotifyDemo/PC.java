package com.threads.waitNotifyDemo;

public class PC {
    public static void main(String[] args) {
        QueueSome q = new QueueSome();
        new Producer(q);
        new Consumer(q);
        System.out.println("press Ctrl-C to stop");
    }
}
