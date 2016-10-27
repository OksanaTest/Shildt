package com.threads.phaserWorkDemo;

import java.util.concurrent.Phaser;

public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        int curPhase;
        System.out.println("threads run");
        new MyThread(phaser, "A");
        new MyThread(phaser, "B");
        new MyThread(phaser, "C");
        //waiting for first phase will be finished by all threads
        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("phase " + curPhase + " is finished");
        //waiting for second phase will be finished by all threads
        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("phase " + curPhase + " is finished");
        //waiting for third phase will be finished by all threads
        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("phase " + curPhase + " is finished");
        //cansel registration for main thread
        phaser.arriveAndAwaitAdvance();
        if (phaser.isTerminated()){
            System.out.println("phaser finished works");
        }
    }

}
