package com.mycode.model;

public class OurDate {
	
	private String fromDate;
	private String toDate;
	private long dateDifference;
	private String errorMessage;
	
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public long getDateDifference() {
		return dateDifference;
	}
	public void setDateDifference(long dateDifference) {
		this.dateDifference = dateDifference;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	@Override
	public String toString() {
		return "OurDate [fromDate=" + fromDate + ", toDate=" + toDate + ", dateDifference=" + dateDifference
				+ ", errorMessage=" + errorMessage + "]";
	}
	
}
