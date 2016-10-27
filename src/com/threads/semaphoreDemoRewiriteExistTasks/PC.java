package com.threads.semaphoreDemoRewiriteExistTasks;

public class PC {
    public static void main(String[] args) {
        QueueSomeSem queueSomeSem = new QueueSomeSem();
        new ProducerSem(queueSomeSem);
        new ConsumerSem(queueSomeSem);

    }
}
