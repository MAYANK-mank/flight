package com.fms.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.fms.dao.FlightDAO;
import com.fms.dto.Flight;

public class FlightServiceImpl implements FlightService{
	
	@Autowired
	FlightDAO flightDAO;
	
	@Override
	public Flight addFlight(Flight flight) {
		return flightDAO.addFlight(flight);
	}

}
