package com.fms.add_flight.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fms.add_flight.dto.Flight;
import com.fms.add_flight.repository.FlightRepository;

@Service
public class FlightService{

	@Autowired
	FlightRepository flightRepository;
	
	public List<Flight> getAllflights() 
	{
	List<Flight> flights = new ArrayList<>();
	flightRepository.findAll().forEach(flight1 -> flights.add(flight1));
	return flights;
	}
	
	public void update(Flight flights, int flightNumber) 
	{
	flightRepository.save(flights);
	}
	public void saveOrUpdate(Flight flight) 
	{
	flightRepository.save(flight);
	}
}