package com.springboot.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reservation {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int reservationId;
	@Column(name="startDay")
	private int startDay;
	@Column(name="endDay")
	private int endDay;
	@Column(name="roomId")
	private int roomId;
	@Column(name="status")
	private String status;  //booked and cancelled 
	@Column(name="userID")
	private String userID;
	public Reservation()
	{
		
	}
	public Reservation(int startDay, int endDay, int roomId, String status, String userID)
	{
		
	}
	public int getId() {
		return reservationId;
	}
	public void setId(int reservationId) {
		this.reservationId = reservationId;
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
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	 
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}  
	public String toString(){//overriding the toString() method  
		 
		 return "reservationId=" + reservationId + " " + "startDay="+ startDay + " " + "endDay="+endDay + "roomId=" + roomId + "status=" + status+ "userID=" + userID ;
	 }
	
}
