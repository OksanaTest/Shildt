package com.shildt.threads.deadLockDemo;
/*
309
 */
public class A {
    synchronized void foo(B b){
        String name = Thread.currentThread().getName();
        System.out.println(name + " come into method A.foo()");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("Class A was interrupted");
        }
        System.out.println(name + " try to call method B.last()");
        b.last();
    }
    synchronized void last(){
        System.out.println(" in the method A.last");
    }
}
