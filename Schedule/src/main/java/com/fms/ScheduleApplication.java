package com.fms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fms.dao.ScheduleDAO;
import com.fms.dao.ScheduleDAOImpl;
import com.fms.service.ScheduleService;
import com.fms.service.ScheduleServiceImpl;

@SpringBootApplication
public class ScheduleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScheduleApplication.class, args);
	}

	@Bean
	public ScheduleService getScheduleService()
	{
		return new ScheduleServiceImpl();
	}
	
	@Bean
	public ScheduleDAO getScheduleDAO()
	{
		return new ScheduleDAOImpl();
	}
}
