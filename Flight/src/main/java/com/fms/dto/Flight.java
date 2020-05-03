package com.fms.dto;

import java.math.BigInteger;

public class Flight {

	private BigInteger flightNumber;
	private String flightModel;
	private String carrierName;
	private Integer seatCapacity;
	
	public BigInteger getFlightNumber()
	{
		return flightNumber;
	}
	public Flight(BigInteger flightNumber, String flightModel, String carrierName, Integer seatCapacity) {
		super();
		this.flightNumber = flightNumber;
		this.flightModel = flightModel;
		this.carrierName = carrierName;
		this.seatCapacity = seatCapacity;
	}
	
	public void setFlightNumber(BigInteger flightNumber) {
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
	public Integer getSeatCapacity() {
		return seatCapacity;
	}
	public void setSeatCapacity(Integer seatCapacity) {
		this.seatCapacity = seatCapacity;
	}
	
	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", flightModel=" + flightModel + ", carrierName=" + carrierName + ", seatCapacity=" + seatCapacity + "]";
	}
	
	
}
