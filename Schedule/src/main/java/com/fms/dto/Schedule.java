package com.fms.dto;

import java.time.LocalDateTime;

public class Schedule {

	public String sourceAirport;
	public String destinationAirport;
	
	
	public LocalDateTime getArrivalDateTime() {
		return arrivalDateTime;
	}
	public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}
	public String getSourceAirport() {
		return sourceAirport;
	}
	public void setSourceAirport(String sourceAirport) {
		this.sourceAirport = sourceAirport;
	}
	public String getDestinationAirport() {
		return destinationAirport;
	}
	public void setDestinationAirport(String destinationAirport) {
		this.destinationAirport = destinationAirport;
	}
	public LocalDateTime getDepartureDateTime() {
		return departureDateTime;
	}
	public void setDepartureDateTime(LocalDateTime departureDateTime) {
		this.departureDateTime = departureDateTime;
	}
	
	public LocalDateTime arrivalDateTime;
	public LocalDateTime departureDateTime;
	
	public Schedule(String sourceAirport, String destinationAirport, LocalDateTime arrivalDateTime, LocalDateTime departureDateTime) {
		super();
		this.sourceAirport = sourceAirport;
		this.destinationAirport = destinationAirport;
		this.arrivalDateTime = arrivalDateTime;
		this.departureDateTime = departureDateTime;
		
	}
	@Override
	public String toString()
	{
		return "Schedule [departureDateTime=" + departureDateTime + ", arrivalDateTime=" + arrivalDateTime + "]";
	}
}
