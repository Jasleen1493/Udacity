package com.jasleen.udacity;

import java.util.Scanner;

/**
 * Complete the class. Using a Scanner, ask the user to enter a series of
 * integers with the following string "Enter an integer" and count the number of
 * even numbers Use a loop. Do not let bad input (a non-integer) terminate your
 * program with an error. When the user enters any non-integer, print the number
 * of even integers entered and quit. Hint: remember hasNextInt() Hint: use the
 * % operator to determine if a number is even
 */
public class CountEvenTester {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = 0;
		int input = 0;
		System.out.println("Enter the number of inputs : ");
		int max = in.nextInt();
			for (int i = 0; i < max; i++) {
				System.out.println("Enter an integer");
				input = in.nextInt();
				if (input % 2 == 0) {
					count++;
				}
			}
			System.out.println("Number of even integers : " + count);

	}
}
