package com.jasleen.udacity.dayLogics.copy;

public class WhatDayWillItBe {
	private static final int[] DAYS_OF_WEEK = { 0, 1, 2, 3, 4, 5, 6 };

	private static int dayInTheYear(int y, int d) {
		int day = 0;
		return day;
	}

	public static void main(String[] args) {
		// Please do not change the name of this variable
		// We may change this value when we run your program
		// It will always be a date >= January 1, 1900
		Day birthday = new Day(1989, 7, 1);
		Day day = new Day(1983, 6, 18);
		// January 1, 1900 was a Monday
		Day initialDay = new Day(1900, 1, 1);
		// Compute the number of days from that day until the birthday
		// Compute the weekday: 0 - Sunday, 1 - Monday, ..., 6 - Saturday
		int diff = day.daysFrom(initialDay);
		System.out.println("Difference of days from initial to the day: " + diff);
		System.out.println("Day of the year " + dayInTheYear(1983, 18));
		// System.out.print("Weekday: " + initialDay.weekday);
	}
}