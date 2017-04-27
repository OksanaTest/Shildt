package com.shildt.threads.phaseExtandsWorkDemo;

import java.util.concurrent.Phaser;

/*
1025
 */
public class MyPhaser extends Phaser{
    int numPhases;
    MyPhaser(int parties, int phaserCoun){
        super(parties);
        numPhases = phaserCoun - 1;
    }
    // override onAdvance() to execute defined phase quantity
    protected boolean onAdvance(int p,  int regParties){
        System.out.println("phase " + p + " is finished");
        if ((p == numPhases || regParties == 0)) {
            return true;
        }else return false;
    }
}
