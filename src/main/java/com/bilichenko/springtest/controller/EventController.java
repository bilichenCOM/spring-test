package com.bilichenko.springtest.controller;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bilichenko.springtest.service.EventService;

@Controller
public class EventController {

	private EventService eventService;

	@Autowired
	public EventController(EventService eventService) {
		this.eventService = eventService;
	}

	@RequestMapping(value = "/events", method = RequestMethod.GET)
	public ModelAndView getAll(ModelAndView mav) {
		mav.addObject("events", eventService.getAll()
				.orElseGet(Collections::emptyList));
		mav.setViewName("events");
		return mav;
	}
}
