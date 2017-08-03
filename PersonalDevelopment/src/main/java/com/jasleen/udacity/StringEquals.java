package com.jasleen.udacity;

/**
 * Complete this method to determine if the string parameter instructor is the same as
 * your Udacity instructor, Cay Horstmann
 */

public class StringEquals
{
    private String firstName = "Cay";
    private String lastName = "Horstmann";

    /**
     * Determines if the instructor given is the instructor in this course, Cay Horstmann
     * @param instructor the name to check
     * @return true if the instructor is Cay Horstmann. False otherwise
     */
    public boolean isMyInstructor(String instructor)
    {
        //fullName contains Cay Horstmann
        String fullName = firstName + " " + lastName;
        if(fullName.equals(instructor))
        return true;
        
        return false;
    }
    
    public static void main(String[] args) {
		boolean done = false;
		System.out.println(!!done);
	}
}
