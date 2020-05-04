package com.fms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fms.dto.Flight;
import com.fms.service.FlightService;

@RestController
public class FlightController {
	
	@Autowired
	FlightService flightService;
	
	@PostMapping("/addflight")
	public Flight addFlight(@RequestBody Flight flight)
	{
		return flightService.addFlight(flight);
	}

}
