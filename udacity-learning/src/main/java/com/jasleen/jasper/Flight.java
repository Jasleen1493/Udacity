package com.jasleen.jasper;

import java.io.Serializable;

public class Flight implements Serializable{
/*	private FlightTimeDetails flightTimeDetails;
	private FlightKey flightKey;
	private FlightPaxInfo paxInfo;*/

	private String delayCode;
	
	private String delayReason;
	
	private String departureDelay;
	
	
	
	private String airCraftType;
	private String registrationNo;
	
	private String arrStation;
	
    private String depStation;
	
    private String flightNo;
	
    private String departureDate;


	private Integer adultCount;
	
	private Integer childCount;
	
    private String firstBoardedAt;

    private String lastBoardedAt;

    private Boolean isUpdated;
    
	
	private long id;

    private String sta;

    private String std;

    private String eta;

    private String etd;

    private String ata;

    private String atd;

	Flight(){
		
	}
	public String getAirCraftType() {
		return airCraftType;
	}

	public void setAirCraftType(String airCraftType) {
		this.airCraftType = airCraftType;
	}

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

	public Integer getAdultCount() {
		return adultCount;
	}

	public void setAdultCount(Integer adultCount) {
		this.adultCount = adultCount;
	}

	public Integer getChildCount() {
		return childCount;
	}

	public void setChildCount(Integer childCount) {
		this.childCount = childCount;
	}

	public String getFirstBoardedAt() {
		return firstBoardedAt;
	}

	public void setFirstBoardedAt(String firstBoardedAt) {
		this.firstBoardedAt = firstBoardedAt;
	}

	public String getLastBoardedAt() {
		return lastBoardedAt;
	}

	public void setLastBoardedAt(String lastBoardedAt) {
		this.lastBoardedAt = lastBoardedAt;
	}

	public Boolean getIsUpdated() {
		return isUpdated;
	}

	public void setIsUpdated(Boolean isUpdated) {
		this.isUpdated = isUpdated;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSta() {
		return sta;
	}

	public void setSta(String sta) {
		this.sta = sta;
	}

	public String getStd() {
		return std;
	}

	public void setStd(String std) {
		this.std = std;
	}

	public String getEta() {
		return eta;
	}

	public void setEta(String eta) {
		this.eta = eta;
	}

	public String getEtd() {
		return etd;
	}

	public void setEtd(String etd) {
		this.etd = etd;
	}

	public String getAta() {
		return ata;
	}

	public void setAta(String ata) {
		this.ata = ata;
	}

	public String getAtd() {
		return atd;
	}

	public void setAtd(String atd) {
		this.atd = atd;
	}

	

}
