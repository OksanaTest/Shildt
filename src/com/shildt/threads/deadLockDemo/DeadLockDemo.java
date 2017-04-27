package com.shildt.threads.deadLockDemo;

public class DeadLockDemo implements Runnable{
    A a = new A();
    B b = new B();
    DeadLockDemo(){
        Thread.currentThread().setName("main thread ");
        Thread t = new Thread(this, "one more thread ");
        t.start();
        a.foo(b);//thread a is blocked for another thread
        System.out.println("return to main thread");
    }
    public void run(){
        b.bar(a);//thread b is blocked for another thread
        System.out.println("return to another thread ");
    }

    public static void main(String[] args) {
        new DeadLockDemo();
    }
}
