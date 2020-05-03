package com.fms.add_flight.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fms.add_flight.dto.Route;
import com.fms.add_flight.service.RouteServiceImpl;

@RestController
public class RouteController {

RouteServiceImpl routeService = new RouteServiceImpl();
Route route = new Route();

//-- Add a route
@RequestMapping("sourceairport")
public SourceAirport sourceAirport() {
	routeService.addSourceAirport(sourceAirport);
	 return "sourceAirport";
}
@RequestMapping("destinationairport")
public DestinationAirport destinationAirport() {
	 routeService.addDestinationAirport(destinationAirport);
	 return "destinationAirport";
}

}
