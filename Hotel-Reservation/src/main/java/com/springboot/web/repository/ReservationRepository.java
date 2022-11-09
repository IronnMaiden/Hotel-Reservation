package com.springboot.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.web.entity.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,Integer>{

	public List<Reservation> findByStatus(String status);
	
	public List<Reservation> findByEndDayGreaterThanEqualAndStartDayLessThanEqual(int startDay, int endDay);
	
	public List<Reservation> findByUserID(String userID);
	
	
}
