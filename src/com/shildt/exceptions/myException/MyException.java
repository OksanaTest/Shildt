package com.shildt.exceptions.myException;

public class MyException extends Exception {
    private int detail;
    MyException(int detail) {
        this.detail = detail;
    }
    @Override
    public String toString(){
        return "MyException[" + detail + "]";
    }
}
