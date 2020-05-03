package com.fms.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fms.dto.Flight;
import com.fms.service.FlightService;

@RestController
public class FlightController {
	
	FlightService flightService;
	
	@RequestMapping("/addflight")
	private List<Flight> getAllFlights()
	{
		return flightService.getAllFlights();
	}

}
