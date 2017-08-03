package com.jasleen.DateCalendar;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class DateCalendar {
public static void main(String[] args) {
	
	Date date = new Date();
	System.out.println("Date \n" +date.toString());
	
	
	Calendar cc = Calendar.getInstance();
	System.out.println("Calendar \n" +cc);
	
	LocalDateTime currentTime = LocalDateTime.now();
	System.out.println(currentTime);
}
}
