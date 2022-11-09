package com.springboot.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.web.DDOS.ReservationRequest;
import com.springboot.web.entity.Reservation;
import com.springboot.web.entity.User;
import com.springboot.web.service.ReservationService;

@RestController
public class ReservationController {

	@Autowired
	private ReservationService reservationService;
	
	
	private Boolean validateDay(int Day)
	{
		return Day>=0 && Day<=365;
	}
	
	@PostMapping("/reservations")
	public String reserve(@RequestBody ReservationRequest reservationRequest) 
	{
		
		if(validateDay(reservationRequest.getStartDay()) && validateDay(reservationRequest.getEndDay() ) && reservationRequest.getStartDay() <=reservationRequest.getEndDay())
		{
			Boolean chkStatus = reservationService.reserve(reservationRequest);
			if(chkStatus)
			{
				return "Accepted";
			}
		}
		
		
		return "Declined";
	}
	
	
	//fetch reservations for particular userID
	@GetMapping("/reservations/{id}")
	public List<Reservation> fetchReservationsByuserId(@PathVariable("id") String userID)
	{
		System.out.println("fetchByid");
		return reservationService.fetchReservationsByuserId(userID);
		
	}
	
	
	
}
