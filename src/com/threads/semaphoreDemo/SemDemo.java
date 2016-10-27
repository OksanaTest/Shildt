package com.threads.semaphoreDemo;

import java.util.concurrent.Semaphore;

/*
1009
 */
public class SemDemo {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);
        new IncThread(sem, "A");
        new DecThread(sem, "B");
    }
}
