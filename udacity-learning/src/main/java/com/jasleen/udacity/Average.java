package com.jasleen.udacity;

//Bluej project: lesson6/average
//Write a program that helps a user compute their average time
//for sprinting 100 meters.

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = 0;
		double sum = 0;
		double value;
		boolean done = false;
		System.out.print("Enter a value, Q to quit: ");
	    while(!done){
		if(in.hasNextDouble())
	        {
	            value = in.nextDouble();
	            if (value != 0)
	            {
	                sum = sum + value;
	                count++;
	            }
	    		System.out.print("Enter a value, Q to quit: ");
	        }
	       else{
	        	System.out.println("No Input");
	        	done = true;
	       }
	       }
	        double average = sum / count;
	        System.out.printf("Average: %.2f\n", average);
	    }
	}
