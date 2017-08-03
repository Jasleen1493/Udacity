package com.jasleen.udacity;

/**
 * Created by jasleen on 7/26/2017.
 */
// Bluej project: lesson6/counting_matches_digits
/**
 * A class that represents a number and can report properties of the number.
 */
public class Number {
	private long number;

	public Number(long number) {
		this.number = number;
	}

	/**
	 * Returns the number of times digitToMatch appears in this number.
	 * 
	 * @param digitToMatch
	 *            the digit to search for. must be at least 0 and at most 9.
	 * @return number of occurrences of digitToMatch
	 */
	public int countMatchingDigits(int digitToMatch) {
		// TODO: count and return the number of times the given digit appears in
		// the number
		int counter = 0;
		int digit = (int) (number % 10);
		while (digit != 0) {
			Long rNumber = number / 10;
			if (digit == digitToMatch) {
				counter++;
				digit = (int) (rNumber % 10);
				rNumber = rNumber / 10;
				// return counter;
			} else {
				digit = (int) (rNumber % 10);
				rNumber = rNumber / 10;
				//return counter;
			}
		}
		return counter;

		// Hint: The last digit is (int)(numbers % 10).
	}
	
	public static void main(String[] args) {
		Number number = new Number(7896547896587456321L);
		int times = number.countMatchingDigits(7);
		System.out.println("Desired digit appears " + times + " times");
		
		

	}
}
