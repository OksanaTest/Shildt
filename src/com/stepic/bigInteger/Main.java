package com.stepic.bigInteger;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println("factorial is: " + factorial(5));

    }
    public static BigInteger factorial(int value) {
        BigInteger fact=BigInteger.valueOf(1);

        for (BigInteger bi = BigInteger.valueOf(1);
             bi.compareTo(BigInteger.valueOf(value)) <= 0;
             bi = bi.add(BigInteger.valueOf(1))) {

            fact = fact.multiply(bi);
        }
        return fact; // your implementation here
    }
}
