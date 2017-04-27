package com.shildt.threads.exchangerWorkDemo;

import java.util.concurrent.Exchanger;

public class UseString implements Runnable {
    Exchanger<String> stringExchanger;
    String string;

    UseString(Exchanger<String> stringExchanger) {
        this.stringExchanger = stringExchanger;
        new Thread(this).start();
    }

    public void run() {
        for (int i = 0; i < 3; i ++) {
            try {
                //change empty buffer to full
                string = stringExchanger.exchange(new String());
                System.out.println("receive: " + string);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
