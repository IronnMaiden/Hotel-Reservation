package com.springboot.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.web.entity.Room;
import com.springboot.web.repository.RoomRepository;

@Service
public class RoomServiceImpl implements RoomService {

	@Autowired
	private RoomRepository roomRepository;
	
	@Override
	public Room saveRoom(Room room) {
		// TODO Auto-generated method stub
		
		System.out.println("room=" + room);
		return roomRepository.save(room);
		
	}

}
