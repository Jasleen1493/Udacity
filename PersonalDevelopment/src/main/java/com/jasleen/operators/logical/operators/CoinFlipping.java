package com.jasleen.operators.logical.operators;

import java.util.Random;
import java.util.Scanner;

import static org.apache.commons.lang.math.RandomUtils.nextInt;

/**
 * Created by jasleen on 3/15/2017.
 */
public class CoinFlipping {
    public static int getRandomNumberInRange(int min, int max) {
        Random rand = new Random();
        return rand.ints(min, max).findFirst().getAsInt();
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Enter number of times you want to flip the coin");
        // int n=System.console().hashCode(); // gives null pointer
        Scanner sc=new Scanner(System.in);
        n = sc.nextInt();
        Random r = new Random();
        int head = r.nextInt(2);
        int tail = r.nextInt(2);
        for (int i = 0; i <n ; i++) {
            System.out.println(getRandomNumberInRange(head,tail));
        }
    }
}
