package com.springboot.web.repository;

import java.util.List;

import javax.persistence.OrderBy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.web.entity.Room;

public interface RoomRepository extends JpaRepository<Room,Integer>{

	@OrderBy("RoomID ASC")
	public Room findFirstByRoomIDIsNotIn(List<Integer>roomsReserved);
	

}
