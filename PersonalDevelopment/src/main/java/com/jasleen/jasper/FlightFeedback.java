package com.jasleen.jasper;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FlightFeedback implements Serializable {
	
	private long id;
	
	private String department;

	private String description;

	public FlightFeedback(){}

}
