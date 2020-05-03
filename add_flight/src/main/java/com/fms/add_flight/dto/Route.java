package com.fms.add_flight.dto;

public class Route {

	 private String sourceAirport;
	 private String departureAirport;
	/**
	 * @return the sourceAirport
	 */
	public String getSourceAirport() {
		return sourceAirport;
	}
	/**
	 * @param sourceAirport the sourceAirport to set
	 */
	public void setSourceAirport(String sourceAirport) {
		this.sourceAirport = sourceAirport;
	}
	/**
	 * @return the departureAirport
	 */
	public String getDepartureAirport() {
		return departureAirport;
	}
	/**
	 * @param departureAirport the departureAirport to set
	 */
	public void setDepartureAirport(String departureAirport) {
		this.departureAirport = departureAirport;
	}
}
