package com.springboot.web.service;

import java.util.List;

import com.springboot.web.entity.Reservation;
import com.springboot.web.DDOS.ReservationRequest;
public interface ReservationService {



	public Boolean reserve(ReservationRequest reservationRequest);


	public List<Reservation> fetchReservationsByuserId(String userID);

	

}
