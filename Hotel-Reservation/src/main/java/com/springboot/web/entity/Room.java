package com.springboot.web.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Room {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int roomID;
	private int roomNo;
	private int roomSize;
	
	public int getRoomID() {
		return roomID;
	}
	public void setRoomID(int roomID) {
		this.roomID = roomID;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public int getRoomSize() {
		return roomSize;
	}
	public void setRoomSize(int roomSize) {
		this.roomSize = roomSize;
	} 
	
	public String toString(){//overriding the toString() method  
		 
		 return "roomID=" + roomID + " " + "roomNo="+ roomNo + " " + "roomSize="+roomSize;
	 }
	
}
