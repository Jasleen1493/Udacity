package com.jasleen.udacity;

public class Operators {
	 
	
	private int width;
	private int height;

	 public Operators(int width, int height)
	    {
	        this.width = width;
	        this.height = height;
	        for (int x = 0; x < width; x++)
	        {
	            for (int y = 0; y < height; y++)
	            {
	            	calculateValue(x, y);
	            }
	        }
	    }
	
	public void calculateValue(int x, int y)
	{
		if((x <= width/3) && (y<=height))
		{
		System.out.println("First Case Exceuted");	
		}
		else if ((x>=(width/3)) && ((x<=((2*width)/3)))){//(x<=((width/3)+(width/3)))&& (y<=height)){
			System.out.println("Second Case Exceuted");
		}
		else{
			System.out.println("Third Case Exceuted");
		}
	}
	
/*	public void printValue(int a, int b){
		for (int x = 0; x < width; x++)
        {
            for (int y = 0; y < height; y++)
            {
                calculateValue(a, b);
            }
        }
	}*/
	
	public static void main(String[] args) {
		Operators operators = new Operators(30, 10);
/*		operators.printValue(10, 20);
		operators.printValue(110, 120);
		operators.printValue(210, 220);*/
		operators.calculateValue(1, 2);
		operators.calculateValue(10, 2);
		operators.calculateValue(11, 12);
		operators.calculateValue(20, 12);
		operators.calculateValue(21, 22);
		operators.calculateValue(30, 22);
	}
}
