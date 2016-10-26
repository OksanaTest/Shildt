package com.threads.synchronisedBlockWorkDemo;
/*
303
 */
public class Caller implements Runnable{
    CallMe target;
    String msg;
    Thread t;
    Caller (CallMe target, String msg){
        this.msg = msg;
        this.target = target;
        t = new Thread(this);
        t.start();
    }
    public void run() {
        synchronized (target) {//synchronized block
            target.call(msg);
        }
    }
}
