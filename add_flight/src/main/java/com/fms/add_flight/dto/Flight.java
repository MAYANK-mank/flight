package com.fms.add_flight.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
// mark class as an Entity

// definining class name as table name
@Table
public class Flight {
	
@Id
@Column
private int flightNumber;
@Column 
private String flightModel;
@Column
private String carrierName;
@Column
private int seatCapacity;

@Override
public String toString() {
	return "Flight [flightNumber=" + flightNumber + ", flightModel=" + flightModel + ", carrierName=" + carrierName
			+ ", seatCapacity=" + seatCapacity + "]";
}

public void setFlightNumber(int flightNumber) {
	this.flightNumber = flightNumber;
}
public String getFlightModel() {
	return flightModel;
}
public void setFlightModel(String flightModel) {
	this.flightModel = flightModel;
}
public String getCarrierName() {
	return carrierName;
}
public void setCarrierName(String carrierName) {
	this.carrierName = carrierName;
}
public Flight(int flightNumber, String flightModel, String carrierName, int seatCapacity) {
	super();
	this.flightNumber = flightNumber;
	this.flightModel = flightModel;
	this.carrierName = carrierName;
	this.seatCapacity = seatCapacity;
}
public int getSeatCapacity() {
	return seatCapacity;
}
public void setSeatCapacity(int seatCapacity) {
	this.seatCapacity = seatCapacity;
}
}
