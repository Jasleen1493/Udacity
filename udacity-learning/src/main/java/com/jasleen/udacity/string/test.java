package com.jasleen.udacity.string;

public class test {
	public static void main(String args[])
	{
		int x=13;
		int y =  x;
		y=12;
		System.out.println(x +"+"+ y);
	
		String river = "Mississippi";
		String river2 = river;
		river2.toUpperCase();
		System.out.println(river);
		System.out.println(river2);
		String newRiver=river.replace("i", "x");
		System.out.println(newRiver.toUpperCase().toLowerCase());
		System.out.println(newRiver);
		if(river == newRiver){
        System.out.println("same");
		}
		else {
			System.out.println("not same");
		}
		double o = 2;
		System.out.println(o);
		double sqrt = Math.sqrt(o);
		System.out.println(sqrt);
		double sq = sqrt * sqrt;
		
		if(sq==o){
			System.out.println("they are same");
		}
		else{
			System.out.println("they are not same " +sq);
			
		}
	}
}
