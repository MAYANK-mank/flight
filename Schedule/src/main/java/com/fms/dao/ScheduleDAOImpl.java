package com.fms.dao;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fms.dto.Schedule;

public class ScheduleDAOImpl implements ScheduleDAO{
	
    public List<Schedule> scheduleList = new ArrayList<Schedule>();
    
    @Override
    public void addSchedule(Schedule schedule)
    {
    	scheduleList.add(schedule);
    	System.out.println(scheduleList);
    }

	public void Schedule(Schedule sourceAirport, Schedule destinationAirport, 
			               LocalDateTime departureDateTime, LocalDateTime arrivalDateTime) 
	{
		
	}

	@Override
	public List<Schedule> getAllSchedules() {
		// TODO Auto-generated method stub
		return scheduleList;
	} 
}
