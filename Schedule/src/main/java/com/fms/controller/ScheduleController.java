package com.fms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fms.dto.Schedule;
import com.fms.service.ScheduleService;

@RestController
public class ScheduleController {
	
	@Autowired
	ScheduleService scheduleService;
	
	@PostMapping("/addschedule")
	public void addSchedule(@RequestBody Schedule schedule)
	{
		scheduleService.addSchedule(schedule);
	}
}
