package com.springboot.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.web.entity.Reservation;
import com.springboot.web.entity.Room;
import com.springboot.web.repository.ReservationRepository;
import com.springboot.web.repository.RoomRepository;
import com.springboot.web.DDOS.ReservationRequest;


@Service
public class ReservationServiceimpl implements ReservationService {

	@Autowired
	private ReservationRepository reservationRepository;
	@Autowired
	private RoomRepository roomRepository;

	
	
	private Room nextAvailablerooms(int startDay, int endDay)
	{
		List<Reservation>reservations = reservationRepository.findByEndDayGreaterThanEqualAndStartDayLessThanEqual(startDay,endDay);
		System.out.println("reservations=" + reservations.toString());

		List<Integer>roomsReserved = new ArrayList<Integer>();
		roomsReserved.add(-1);
		

		for(int i=0; i<reservations.size(); i++)
		{
			roomsReserved.add(reservations.get(i).getRoomId());
		}

		Room availableRooms = roomRepository.findFirstByRoomIDIsNotIn(roomsReserved);


		//System.out.println("availableRooms=" + availableRooms.toString());

		return availableRooms;
		
	}
	@Override
	public Boolean reserve(ReservationRequest reservationRequest) {
		// TODO Auto-generated method stub
		
		//check for available rooms\
		System.out.println("reservationRequest=" + reservationRequest.toString());
		Room room = nextAvailablerooms(reservationRequest.getStartDay(), reservationRequest.getEndDay());
		if(room==null)
		{
			return false;
		}
		
		Reservation reservation = new Reservation();
		reservation.setStartDay(reservationRequest.getStartDay());
		reservation.setEndDay(reservationRequest.getEndDay());
		reservation.setRoomId(room.getRoomID());
		reservation.setStatus("Booked");
		reservation.setUserID(reservationRequest.getUserId());
		
		System.out.println("reservation=" + reservation.toString() );

		reservationRepository.save(reservation);
		return true;
	}
	
	
	@Override
	public List<Reservation> fetchReservationsByuserId(String userID) {
		// TODO Auto-generated method stub
		System.out.println("reservations=");
		
		return reservationRepository.findByUserID(userID);
		
		
		
	}
	

	

	

}
