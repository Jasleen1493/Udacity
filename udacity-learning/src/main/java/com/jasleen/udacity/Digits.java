package com.jasleen.udacity;

public class Digits {

	public int lastDigit(int number) {
		// your code goes here.
		int last = number%10;
		return last;
	}

	public double average(int test1, int test2, int test3)
    {
        double sum = test1 + test2 +test3;
        double average = (sum)/3;
        return average;
    }
	
	public static void main(String[] args) {
		float GPA = 1235.245879f;
		System.out.printf("%10.1f\n",GPA); // %X.Yf = X : width ; Y : decimal k baad ki width
		
		String name = "Jasleen";
		String score = "0";
		System.out.println(name.concat(":" + " " + score + " "+ name + ";"));
	
		System.out.println(new Digits().lastDigit(1023546));
		String book = "My favorite book is,"+ "Warrior's Apprentice"+"";
		System.out.println(book);
		
		String text = "Ruuytieo";
		//System.out.println(text.substring(text.length()-1)); 
		String text1 = "Udacity";
		System.out.println(text1.substring(3,text1.length()));
		//System.out.println(text);
	}
}
