package com.threadsGolovach;

public class TwoThreadsWork {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i <= 5; i++) {
                    sillyWork();
                    System.out.println("Hello! " + Thread.currentThread().getName());
                }
            }
        }
        ).start();
        for (int i = 0; i <= 5; i++){
            sillyWork();
            System.out.println("Bye! " + Thread.currentThread().getName());
        }
    }
    public static void sillyWork(){
        double d = 2.0;
        for (int i = 0; i <= 5_000_000; i++){
            Math.sin(d);
        }
    }
}
