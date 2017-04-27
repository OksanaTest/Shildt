package com.shildt.threads.semaphoreDemoRewiriteExistTasks;

public class ProducerSem implements Runnable {
    QueueSomeSem queueSomeSem;
    ProducerSem(QueueSomeSem queueSomeSem){
        this.queueSomeSem = queueSomeSem;
        new Thread(this, "Producer").start();
    }
    public void run(){
        for (int i = 0; i < 20; i++){
            queueSomeSem.put(i);
        }
    }
}
