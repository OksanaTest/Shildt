package com.shildt.threads.notSynchronizeCodeWorkDemo;

public class Synch {
    public static void main(String[] args) {
        CallMe target = new CallMe();
        Caller ob1 = new Caller(target, "Welcome");
        Caller ob2 = new Caller(target, "to the synchronized ");
        Caller ob3 = new Caller(target, "word!!!");
        try {
            ob1.t.join();
            ob2.t.join();;
            ob3.t.join();;
        }catch (InterruptedException e){
            System.out.println("interruption :( ");
        }
    }
}
