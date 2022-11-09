package com.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web.entity.Room;
import com.springboot.web.service.RoomService;
import com.springboot.web.service.RoomServiceImpl;

@RestController
public class RoomController {
	
	@Autowired
	private RoomService roomService;
	
	@PostMapping("/room")
	public Room saveRoom(@RequestBody Room room)
	{
		System.out.println("room=" + room.toString());
		return roomService.saveRoom(room);
	}

}
