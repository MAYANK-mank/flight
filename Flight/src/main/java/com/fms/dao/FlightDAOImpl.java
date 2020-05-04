package com.fms.dao;

import java.util.ArrayList;
import java.util.List;

import com.fms.dto.Flight;

public class FlightDAOImpl implements FlightDAO{
	
	public List<Flight> flightList= new ArrayList<Flight>();
	
	@Override
	public Flight addFlight(Flight flight)
	{
		
		flightList.add(flight);
		System.out.println(flightList);
		return flight;
	}
	
}
