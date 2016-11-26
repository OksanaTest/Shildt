package com.typeCasting.conversion;
/*
91
*/
public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("int to byte: ");
        b = (byte) i;
        System.out.println("i is " + i + " b is " + b);
        System.out.println("double to int: ");
        i = (int) d;
        System.out.println("d is " + d + " i is " + i);
        System.out.println("double to byte: ");
        b = (byte) d;
        System.out.println("d is " + d + " b is " + b);
    }
}
