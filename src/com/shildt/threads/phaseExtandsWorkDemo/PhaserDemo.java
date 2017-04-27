package com.shildt.threads.phaseExtandsWorkDemo;

public class PhaserDemo {
    public static void main(String[] args) {
        MyPhaser myPhaser = new MyPhaser(1, 4);
        System.out.println("threads run");

        new MyThread(myPhaser, "A");
        new MyThread(myPhaser, "B");
        new MyThread(myPhaser, "C");
        //waiting to defined quantity phase are finished work
        while (!myPhaser.isTerminated()){
            myPhaser.arriveAndAwaitAdvance();
        }
        System.out.println("Phaser have been finished work");
    }
}
