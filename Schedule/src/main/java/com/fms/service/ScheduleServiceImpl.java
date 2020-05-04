package com.fms.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.fms.dao.ScheduleDAO;
import com.fms.dto.Schedule;

public class ScheduleServiceImpl implements ScheduleService{
	
	@Autowired
	ScheduleDAO scheduleDAO;
	
	@Override
	public void addSchedule(Schedule schedule)
	{
		scheduleDAO.addSchedule(schedule);
	}
}
