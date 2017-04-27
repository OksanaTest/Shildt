package com.shildt.threads.exchangerWorkDemo;
/*
1020
 */
import java.util.concurrent.Exchanger;

public class ExgrDemo {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();
        new UseString(exchanger);
        new MakeString(exchanger);

    }
}
