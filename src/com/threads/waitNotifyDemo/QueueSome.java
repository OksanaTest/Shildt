package com.threads.waitNotifyDemo;
/*
307
 */
public class QueueSome {
    int n;
    boolean valueSet = false;

    synchronized int get(){
        while(!valueSet){
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println("some interruption");
            }
        }
        System.out.println("received: " + n);
        valueSet = false;
        notify();
        return n;
    }
    synchronized void set(int n){
        while (valueSet){
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println("some interruption");
            }
        }
        this.n = n;
        valueSet = true;
        System.out.println("send " + n);
        notify();
    }

}
