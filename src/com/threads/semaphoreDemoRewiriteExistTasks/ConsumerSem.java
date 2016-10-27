package com.threads.semaphoreDemoRewiriteExistTasks;

public class ConsumerSem implements Runnable {
    QueueSomeSem queueSomeSem;
    ConsumerSem(QueueSomeSem queueSomeSem){
        this.queueSomeSem = queueSomeSem;
        new Thread(this, "Comsumer").start();
    }
    public void run(){
        for (int i = 0; i < 20; i++){
            queueSomeSem.get();
        }
    }
}
