package com.threads.waitNotifyDemo;

public class Consumer implements Runnable{
    QueueSome q;
    Consumer(QueueSome q){
        this.q = q;
        new Thread(this, "consumer").start();
    }
    public void run(){
        while (true){
            q.get();
        }
    }
}
