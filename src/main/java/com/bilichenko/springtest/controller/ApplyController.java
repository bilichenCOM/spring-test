package com.bilichenko.springtest.controller;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bilichenko.springtest.model.Event;
import com.bilichenko.springtest.model.User;
import com.bilichenko.springtest.service.EventService;
import com.bilichenko.springtest.service.UserService;

@Controller
@RequestMapping(value = "/apply")
public class ApplyController {

	@Autowired
	private EventService eventService;

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/for-event", method = RequestMethod.GET)
	public ModelAndView applyAsNewUser(@RequestParam("event_id") Long eventId, ModelAndView mav) {
		mav.addObject("user", new User());
		mav.addObject("eventId", eventId);
		mav.setViewName("apply-new-user");
		return mav;
	}

	@RequestMapping(value = "/for-event", method = RequestMethod.POST)
	public ModelAndView addUserAndApplyForEvent(@ModelAttribute User user,
			@RequestParam("event_id") Long eventId, ModelAndView mav) {
		Event event = eventService.getById(eventId).orElseGet(() -> new Event());
		userService.save(user);
		event.addUser(user);
		eventService.update(event);

		mav.addObject("events", eventService.getAll().orElseGet(Collections::emptyList));
		mav.setViewName("redirect:/events");
		return mav;
	}
}