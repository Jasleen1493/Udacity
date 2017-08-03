package com.jasleen.jasper;

import java.io.Serializable;

public class FlightPaxInfo implements Serializable {
	
	private long id;

	private Integer adultCount;
	
	private Integer childCount;
	
    private String firstBoardedAt;

    private String lastBoardedAt;

    private Boolean isUpdated;

	public FlightPaxInfo(){}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
  
}
