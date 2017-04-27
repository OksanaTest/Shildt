package com.shildt.threads.waitNotifyDemo;
/*
307
 */
public class Producer implements Runnable {
    QueueSome q;

    Producer(QueueSome q) {
        this.q = q;
        new Thread(this, "producer").start();
    }

    public void run() {
        int i = 0;
        while (true) {
            q.set(i++);
        }
    }
}
