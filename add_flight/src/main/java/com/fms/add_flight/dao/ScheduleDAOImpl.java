package com.fms.add_flight.dao;

import java.util.ArrayList;
import java.util.List;

public abstract class ScheduleDAOImpl implements ScheduleDAO{

	 public static void main(String[] args) {
	 List<String> arrivalTime = new ArrayList<String>();
	 
	arrivalTime.add("9:30 AM");
 	arrivalTime.add("10:00 AM");
 	arrivalTime.add("10:30 AM");
 	arrivalTime.add("11:00 AM");
 	arrivalTime.add("11:30 AM");
 	arrivalTime.add("12:00 PM");
 	
 	List<String> departureTime = new ArrayList<String>();
 	
 	departureTime.add("8:30 AM");
	departureTime.add("9:00 AM");
	departureTime.add("9:30 AM");
	departureTime.add("10:00 AM");
	departureTime.add("10:30 AM");
	departureTime.add("11:00 AM");
	 }
}