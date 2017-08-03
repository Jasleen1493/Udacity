package com.jasleen.udacity.decimals;

import com.jasleen.udacity.Balloon;

public class EqualNumbers {
public static void main(String[] args) {
	double original = 2;
	System.out.println(original);
	double root = Math.sqrt(original);
	System.out.println(root);
	double rootSquare = root*root;
	System.out.println(rootSquare);
	if(original == rootSquare)
		{System.out.println("Same");
		}
	double epsilon =1E-12;
	System.out.println(epsilon);
	if(Math.abs(rootSquare-original) < epsilon)
		{System.out.println("Close");}

	
	String str1 = "JAS";
	String str2 = "LEEN";
	String str3 = "JASLEEN";
	String str4 = str1+str2;
	if(str3.equals(str4))
	{
		System.out.println("same");
	}
	
	Balloon balloon = new Balloon();
	Balloon balloon2 = null;
	if(balloon == balloon2){
		System.out.println("Same objects");
	}
	
}
}
