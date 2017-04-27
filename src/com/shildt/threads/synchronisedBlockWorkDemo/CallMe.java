package com.shildt.threads.synchronisedBlockWorkDemo;

public class CallMe {
    void call(String msg){
        System.out.print("[ " + msg);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("interruption");
        }
        System.out.println("]");
    }
}
