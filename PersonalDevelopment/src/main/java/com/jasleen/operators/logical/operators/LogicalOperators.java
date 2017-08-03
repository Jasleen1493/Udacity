package com.jasleen.operators.logical.operators;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * Created by jasleen on 3/15/2017.
 */
public class LogicalOperators {
    public static int getRandomNumberInRange(int min, int max) {
        Random rand = new Random();
        return rand.ints(min, max).findFirst().getAsInt();
    }

    public static void main(String[] args) {
        Random rand = new Random(47);
        int i = rand.nextInt(100); // Random().nextInt(int bound) generates a random integer from 0 (inclusive) to bound (exclusive)
        int j = rand.nextInt(100);
        int k = rand.nextInt(100);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        //treating int as boolean is NOT LEGAL in java
        // System.out.println(" i && j = " + (i && j));
        for (int l = 0; l < 5; l++) {
            System.out.println(getRandomNumberInRange(33, 38));
        }
        System.out.println(Java8.getRandomNumberInRange(5,10));
    }

    long longVal = 12344L;
    double doubleVal = 2342324d;
    long result = (long)(longVal-doubleVal);

}

class Java8 {

    // public IntStream ints(int randomNumberOrigin, int randomNumberBound)
    // public IntStream ints(long streamSize, int randomNumberOrigin, int randomNumberBound)
    public static int getRandomNumberInRange(int min, int max) {
        Random rand = new Random();
        return rand.ints(min, max).findFirst().getAsInt();
    }

}
