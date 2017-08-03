package com.jasleen.udacity.constructors;
// Write a class InchWorm that models an inch worm moving along a 
// horizontal line. The inch worm  moves either to the right or left.
// Initially, the inch worm moves to the right, but it can turn to
// change its direction. In each move, its position changes by one
// unit in the current direction. 

// Provide two constructors. 
// One that takes the initial position as an argument,
// and one with no arguments that sets the initial position to 0. 

// You will need two instance variables. 
// One to keep track of the position and one to keep track of the direction. 
// You can use 1 to represent moving right and -1 to represent moving left. 

// Constructors:
// public InchWorm()
// public InchWorm (int initialPosition)

// Provide these methods:
// public void turn()
// public void move()
// public int getPosition()

// Sample usage:
// InchWorm worm = new InchWorm (10);
// worm.move(); // Now the position is 11
// worm.turn();
// worm.move(); // Now the position is 10


// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 2 - Question 2" for some tips on 
// how to begin. 

public class InchWorm
{
    private int position;
    private int direction;
    // TODO: Add instance variables
   
    public InchWorm()
    {
        position = 0;
        direction=1;
       // TODO: Complete constructor
    }
    
    public InchWorm (int initialPosition)
    {
        position = initialPosition;
        direction=1;
        // TODO: set the instance variable to the constructor parameter
    }
    
    public void move()
    {
        position = position + direction;
            // TODO: Update the position of the inch worm   
    }
    
    public void turn()
    {
        direction = -(direction);
        // TODO: Update the direction
    }
   
    public int getPosition()
    {
        return position;
    }
   
    public int getDirection()
    {
        return direction;
    }
    
    public static void main(String[] args)
    {
       //default constructor
        InchWorm worm1 = new InchWorm();
        System.out.println(worm1.getPosition());
        System.out.println("Expected: 0");
        worm1.move();
        worm1.move();
        worm1.turn();
        worm1.move();
        System.out.println(worm1.getPosition());
        System.out.println("Expected: 1");
        
        //default constructor
        InchWorm worm2 = new InchWorm(10);
        worm2.move();
        worm2.move();
        worm2.move();
        worm2.move();
        System.out.println(worm2.getPosition());
        System.out.println("Expected: 14");
        worm2.turn();
        worm2.move();
        worm2.move();
        worm2.turn();
        worm2.move();
        System.out.println(worm2.getPosition());
        System.out.println("Expected: 13");
        
    }

}
