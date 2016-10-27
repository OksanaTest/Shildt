package com.threads.exchangerWorkDemo;

import java.util.concurrent.Exchanger;

public class MakeString implements Runnable{
    Exchanger<String> exchanger;
    String string;
    MakeString(Exchanger<String> exchanger){
        this.exchanger = exchanger;
        string = new String();
        new Thread(this).start();
    }
    public void run(){
        char ch = 'A';
        for (int i = 0; i < 3; i++){
            //fill buffer
            for (int j = 0; j < 5; j ++){
                string += (char) (ch += 2);
            }
            try {
                //change full buffer to empty
                string = exchanger.exchange(string);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
