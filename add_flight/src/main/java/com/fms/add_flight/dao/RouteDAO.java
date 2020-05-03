package com.fms.add_flight.dao;

import com.fms.add_flight.dto.Route;

public interface RouteDAO {

	public Route addRoutes(Route sourceAirport);
	public Route addRouted(Route destinationAirport);
}
