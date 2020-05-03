package com.fms.dao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import com.fms.dto.Flight;

public class FlightDAOImpl implements FlightDAO{
	
	private List<Flight> flightList= new ArrayList<Flight>();
	@Override
	public Flight addFlight(Flight flight)
	{
		flight.setFlightNumber(new BigInteger("2490"));
		flight.setFlightModel("Airbus A380");
		flight.setCarrierName("Royal Navy");
		flight.setSeatCapacity(150);
		flightList.add(flight);
		return flight;
	}
	
}
