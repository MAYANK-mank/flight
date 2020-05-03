package com.fms.add_flight.dao;

import java.util.ArrayList;
import java.util.List;


public abstract class RouteDAOImpl implements RouteDAO {

	  public static void main(String[] args)
	  {
		  List<String> sourceAirport = new ArrayList<String>();
		  sourceAirport.add("DELHI");
		  sourceAirport.add("MUMBAI");
		  sourceAirport.add("JAIPUR");
		  sourceAirport.add("BANGLORE");
		  sourceAirport.add("CHENNAI");
		  sourceAirport.add("HYDERABAD");
		  
		  
          List<String> destinationAirport = new ArrayList<String>();
          destinationAirport.add("HYDERABAD");
          destinationAirport.add("CHENNAI");
          destinationAirport.add("BANGLORE");
          destinationAirport.add("PUNE");
          destinationAirport.add("KANPUR");
          destinationAirport.add("LUCKNOW");
          
 	  }

}
