package com.jasleen.udacity;

public class Constants {

	public static final int SECONDS_PER_MINUTE=60;

	public void method() {
		final int CONSTANT_VALUE =60;
	}

	public static double getVolume(int r , int h) {
		double volume = ((Math.PI * Math.pow((r), 2) * h))/3;
		// TODO write the code to assign the volume of the cone to the variable
		// volume. Use Math.PI
		return volume;
	}

	public static void main(String[] args) {

		int days = (int) 2345.9 / 24;
		System.out.println(days);
		
		System.out.println(Constants.getVolume(20, 10));
	}
}
