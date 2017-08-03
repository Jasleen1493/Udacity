package com.jasleen.operators.conditional;

/**
 * Created by jasleen on 7/20/2017.
 */
public class Switch {
    public static void main(String[] args) {
        double[] array1 = {123.45,78.43,342.44,904.33};
        double[] array2 = {123.45,78.43,342.44,904.33};
        double[] resultArray = {};

        for (int i = 0; i < array1.length ; i++) {

            switch ((int)(array1[i]+array2[i])) { // switch(expression) : here, expression is a constant or literal
                case 246 :
                    System.out.print("first element of array");
                    break;
            }
        }
    }
}
