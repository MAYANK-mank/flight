package com.fms.add_flight.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fms.add_flight.dto.Schedule;
import com.fms.add_flight.service.ScheduleService;

@RestController
public class ScheduleController {

@Autowired
ScheduleService scheduleService;

@RequestMapping("arrivaltime")
public String addArrivalTime(Schedule arrivalTime) {
	return "arrivalTime";
}
	
@RequestMapping("departuretime")
public String addDepartureTime(Schedule departureTime) {
	return "departureTime";
}
}
