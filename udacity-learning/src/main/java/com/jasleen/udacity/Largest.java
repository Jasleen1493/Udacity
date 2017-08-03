package com.jasleen.udacity;

/**
 * Created by jasleen on 7/26/2017.
 */
// BlueJ project: lesson6/largest1
// Read in the values that the user supplies, stopping
// when the user enters Q (or any other input that is
// not a number). Print out the largest value that
// the user entered.

import java.util.Scanner;

public class Largest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter values, Q to quit: ");
        double largest = in.nextDouble();
        while (in.hasNextDouble()) //supply condition here
        {
            double input=in.nextDouble();
            if (input > largest) // and here
            {
                largest=input;

            }
        }
        System.out.println("Largest value: " + largest);
    }
}
