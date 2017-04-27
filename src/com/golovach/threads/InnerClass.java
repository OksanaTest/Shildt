package com.golovach.threads;

public class InnerClass {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            public void run() {
                System.out.println("run();");
            }
        };
        r.run();
        System.out.println(r.getClass().getName());
    }
}
