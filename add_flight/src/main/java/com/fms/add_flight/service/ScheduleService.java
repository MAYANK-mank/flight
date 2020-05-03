package com.fms.add_flight.service;

import com.fms.add_flight.dao.ScheduleDAO;
import com.fms.add_flight.dao.ScheduleDAOImpl;
import com.fms.add_flight.dto.Schedule;

public class ScheduleService implements ScheduleService {
 
	ScheduleDAO scheduleDAO = new ScheduleDAOImpl();
	
	public Schedule addSchedule(Schedule schdeule)
	{
		return scheduleDAO.addschedule(schdeule);
	}
}
