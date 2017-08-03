package com.jasleen.udacity.string;

import java.util.Scanner;

public class LookUpAnyWord extends Book {

	public LookUpAnyWord(String bookText) {
		super(bookText);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	    {
	        System.out.print("Type a word and I'll tell you how many times it appears: ");
	        Scanner input = new Scanner(System.in);
	        String word = input.next();
	        Book book = new Book("aliceInWonderland.txt");
	        int occurrences = book.occurrencesOf(word);
	        System.out.println(word + " occurs " + occurrences + " times!");
	    }
}
