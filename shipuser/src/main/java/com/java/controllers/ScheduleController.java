package com.java.controllers;

	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import com.java.beans.Schedule;
	import com.java.dao.ScheduleDao;
	
	

	@Controller
	public class ScheduleController {
		
	  @Autowired
	  ScheduleDao dao;
	  @RequestMapping("/ScheduleForm")
	  public String showform(Model m){
	    m.addAttribute("command", new Schedule());
	    return "ScheduleForm";
	  } 
	  @RequestMapping(value="/save3",method = RequestMethod.POST)
	  public String save(@ModelAttribute("schedule") Schedule schedule){
	    dao.save(schedule);
	    return "redirect:/ViewSchedule";
	  }  
	  @RequestMapping("/ViewSchedule")
	  public String ViewSchedule(Model m){
	    List<Schedule> list=dao.getSchedules();
	    m.addAttribute("list",list);
	    return "ViewSchedule";
	  }  
	  @RequestMapping(value="/editschedule/{scheduleId}")
	  public String edit(@PathVariable int scheduleId, Model m){
	    Schedule schedule=dao.getScheduleByScheduleId(scheduleId);
	    m.addAttribute("command",schedule);
	    return "ScheduleEditForm";
	  } 
	  @RequestMapping(value="/editsave3",method = RequestMethod.POST)
	  public String editsave(@ModelAttribute("schedule") Schedule schedule){
	    dao.update(schedule);
	    return "redirect:/ViewSchedule";
	  }
	  @RequestMapping(value="/deleteschedule/{scheduleId}",method = RequestMethod.GET)
	  public String delete(@PathVariable int scheduleId){
	    dao.delete(scheduleId);
	    return "redirect:/ViewSchedule";
	  }
	}

