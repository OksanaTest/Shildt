package com.shildt.threads.deadLockDemo;
/*
309
 */
public class B {
    synchronized void bar(A a){
        String name = Thread.currentThread().getName();
        System.out.println(name + " come into method B.bar()");
        try {
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println("Class is interrupted");
        }
        System.out.println(name + " try to call method A.last()");
        a.last();
    }
    synchronized void last(){
        System.out.println("in the method A.last()");
    }
}
