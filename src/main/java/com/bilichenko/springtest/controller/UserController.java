package com.bilichenko.springtest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bilichenko.springtest.model.User;
import com.bilichenko.springtest.service.UserService;

@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView addUser(ModelAndView mav) {
		mav.addObject("user", new User());
		mav.setViewName("home");
		return mav;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute User user, ModelAndView mav) {
		userService.save(user);
		mav.addObject("message", "User was successfully added!");
		mav.setViewName("home");
		return mav;
	}
}
