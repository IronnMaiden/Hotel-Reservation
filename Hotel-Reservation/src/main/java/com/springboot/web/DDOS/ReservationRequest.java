package com.springboot.web.DDOS;

public class ReservationRequest {

	private String userId;
	private int startDay;
	private int endDay;
	
	public ReservationRequest()
	{
		
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getStartDay() {
		return startDay;
	}
	public void setStartDay(int startDay) {
		this.startDay = startDay;
	}
	public int getEndDay() {
		return endDay;
	}
	public void setEndDay(int endDay) {
		this.endDay = endDay;
	}
	
	public String toString(){//overriding the toString() method  
		 
		 return "userId=" + userId + " " + "startDay="+ startDay + " " + "endDay="+endDay;
	 }
}
