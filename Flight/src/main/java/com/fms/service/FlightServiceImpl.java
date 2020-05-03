package com.fms.service;

import com.fms.dao.FlightDAO;
import com.fms.dto.Flight;

public abstract class FlightServiceImpl implements FlightService{
	FlightDAO flightDAO;
	
	@Override
	public Flight addFlight(Flight flight) {
		return flight;
	}

}
