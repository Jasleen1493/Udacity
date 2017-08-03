package com.jasleen.udacity;

/**
 * Complete the method to find the largest power of 2 less than the given number
 * Use a loop
 */
public class MathUtil
{
    public static int largestPowerOf2(int n)
    {
    	int max =0;
    	for (int i = 0; i < n; i++) {
			if((int)(Math.pow(2, i))< n)
				max = i;
		}
    	return (int)(Math.pow(2, max));
    }
    public static void main(String[] args) {
		System.out.println(largestPowerOf2(9));
		System.out.println(largestPowerOf2(100));
	}
}

