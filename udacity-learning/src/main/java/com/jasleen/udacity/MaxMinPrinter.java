package com.jasleen.udacity;

import java.util.InputMismatchException;

//Write a class called MinMaxPrinter. Using a Scanner, ask the user to enter
//a series of integers and find the maximum and the minimum value.
//Use a loop.

//Do not let bad input (a non-integer) terminate your program with an error.
//When the user enters any non-integer, print the maximum and minimun values
//on separate line and quit.

//If the numbers entered are 5 10 3 8 1, 2 9, the output will be

//10
//1

//HINT: remember hasNextInt()
//HINT: initialize max to Integer.MIN_INTEGER rather than to 0 and min to 
//Integer.MAX_INTEGER before the loop.

//Need help starting this question? In the lesson titled 
//"Starting points: Problem Set Questions", go to the
//problem titled "Problem Set 4 - Question 3" for some tips on 
//how to begin.

import java.util.Scanner;

public class MaxMinPrinter {
	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		try {
			Scanner in = new Scanner(System.in);
			System.out.print("Enter an integer: ");
			int input = in.nextInt();

			int result = 0;
			do {
				System.out.println("Input 1  :" + input);
				System.out.print("Enter an integer: ");
				int input2 = in.nextInt();
				System.out.println("Input 2  :" + input2);
				if (input > input2) {
					System.out.println("input " + input + " is more than " + input2);
					System.out.print("Enter an integer: ");
					input2 = in.nextInt();
					result = input;
				} else {
					System.out.println("input " + input2 + " is more than " + input);
					System.out.print("Enter an integer: ");
					input = in.nextInt();
					result = input2;
				}
			} while (in.hasNextInt());
			System.out.println("Input : " + result + " is the maximum number");
		} catch (InputMismatchException e) {
			System.out.println("Maximum Integer value : " + max + "\nMinimum Integer value : " + min);
		}
	}
}
