package com.golovach.threads;

public class DemonDemonstration {
    public static void main(String[] args) {
        Thread newThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){}
            }
        });
        newThread.setDaemon(true);
        newThread.start();
        System.out.println("Hello!");
    }
}
