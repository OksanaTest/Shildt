package com.threads.phaseExtandsWorkDemo;

import java.util.concurrent.Phaser;

public class MyThread implements Runnable {
    Phaser phaser;
    String name;
    MyThread(Phaser phaser, String name){
        this.phaser = phaser;
        this.name = name;
        phaser.register();
        new Thread(this).start();
    }
    public void run(){
        while (!phaser.isTerminated()){
            System.out.println("thread " + name + " is started work");
            phaser.arriveAndAwaitAdvance();
            try {
                Thread.sleep(10);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
