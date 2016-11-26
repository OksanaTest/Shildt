package com.typeCasting;
/*
91
 */
public class Conversion {
    public static void main(String[] args) {
        byte b;
        System.out.println("byte var before initialisation");
        int i = 257;
        double d = 323.142;

        System.out.println("INT to BYTE:");
        b = (byte) i;
        System.out.println("i is " + i + " b is " + b);
        System.out.println("DOUBLE to INT");
        i = (int) d;
        System.out.println("d is " + d + " i is " + i);
        System.out.println("DOUBLE to BYTE");
        b = (byte) d;
        System.out.println("d is " + d + " b is " + b);
    }
}
/*
RESULT:

byte var before initialisation
INT to BYTE:
i is 257 b is 1
DOUBLE to INT
d is 323.142 i is 323
DOUBLE to BYTE
d is 323.142 b is 67

 */