package com.shildt.threads.phaserWorkDemo;
import java.util.concurrent.Phaser;
/*
1022
 */
public class MyThread implements Runnable{
    Phaser phaser;
    String string;
    MyThread(Phaser phaser, String string){
        this.phaser = phaser;
        this.string = string;
        phaser.register();
        new Thread(this).start();
    }
    public void run(){
        System.out.println("thread " + string + " start first phase");
        phaser.arriveAndAwaitAdvance(); //thread reached phase
        try {
            Thread.sleep(10);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("thread " + string + "  start second phase");
        phaser.arriveAndAwaitAdvance(); // thread reached phase
        try {
            Thread.sleep(10);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("thread " + string + " start third phase");
        phaser.arriveAndAwaitAdvance(); //thread reached phase,
        // cancel registration for all threads
    }
}
