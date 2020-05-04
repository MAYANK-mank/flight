package com.fms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fms.dao.FlightDAO;
import com.fms.dao.FlightDAOImpl;
import com.fms.service.FlightService;
import com.fms.service.FlightServiceImpl;

@SpringBootApplication
public class FlightApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightApplication.class, args);
	}
	@Bean
	public FlightService getFlightService()
	{
		return new FlightServiceImpl();
	}
	
	@Bean
	public FlightDAO getFlightDAO()
	{
		return new FlightDAOImpl();
	}

}
