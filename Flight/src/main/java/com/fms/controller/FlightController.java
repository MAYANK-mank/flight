package com.fms.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fms.dto.Flight;
import com.fms.service.FlightService;

@RestController
public class FlightController {

	FlightService flightService;
	
	@GetMapping("/addflight")
	private List<Flight> getFlight()
	{
		return flightService.addFlight();
	}

}
