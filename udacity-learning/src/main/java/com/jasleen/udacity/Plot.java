package com.jasleen.udacity;

import java.sql.Timestamp;

public class Plot{

	private int width;
	private int length;

	/**
	 * Constructs a plot of a given size.
	 * 
	 * @param width
	 *            the width of the plot
	 * @param length
	 *            the length of the plot
	 */
	public Plot(int width, int length) {
		this.width = width;
		this.length = length;
	}

	/**
	 * Calculates the number of circular fields that can fit on this plot.
	 */
	public int getNumberOfFields(int radius) {
		// the total number of rows, then
		int diameter = 2 * radius;
		double sqrtOf3 = Math.sqrt(3);
		int totalRows = (int) ((length - diameter) / (radius * sqrtOf3)) + 1;
		// the number of even and odd rows,
		int evenRows = totalRows / 2;
		int oddRows = (totalRows / 2) + (totalRows % 2);
		// the number of columns in each even and odd row,
		int colsInOddRows = (width / diameter);
		int colsInEvenRows = ((width - radius) / diameter);
		int totalFields = ((oddRows) * (colsInOddRows)) + ((evenRows) * (colsInEvenRows));
		// and finally the total number of fields
		return totalFields;
	}
}
