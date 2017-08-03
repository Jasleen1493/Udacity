package com.jasleen.jasper;

import java.io.Serializable;

public class FlightKey implements Serializable{

	private String registrationNo;
	
	private String arrStation;
	
    private String depStation;
	
    private String flightNo;
	
    private String departureDate;

	public FlightKey(){}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getArrStation() {
		return arrStation;
	}

	public void setArrStation(String arrStation) {
		this.arrStation = arrStation;
	}

	public String getDepStation() {
		return depStation;
	}

	public void setDepStation(String depStation) {
		this.depStation = depStation;
	}

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	
}
