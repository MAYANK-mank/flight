package com.fms.dao;

import java.util.List;

import com.fms.dto.Schedule;

public interface ScheduleDAO {

	public void addSchedule(Schedule schedule);
	
	public List<Schedule> getAllSchedules();
}
