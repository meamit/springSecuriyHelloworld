package de.zalando.mentoring.lunchlottery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/user")
@Controller
public class UserController {

	@RequestMapping(value="/home",method = RequestMethod.GET)
	public ModelAndView welcomePage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Hello World");
		model.addObject("message", "This is welcome page!");
		model.setViewName("hello");
		return model;

	}

	@RequestMapping(value = "/admin**", method = RequestMethod.GET)
	public ModelAndView adminPage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Hello World");
		model.addObject("message", "This is admin page!");
		
		model.setViewName("admin");

		return model;

	}
	
	@RequestMapping(value = "/adminprofile**", method = RequestMethod.GET)
	public ModelAndView adminProfile() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Hello World");
		model.addObject("message", "This is admin profile page!");
		
		model.setViewName("adminprofile");

		return model;

	}
	
	@RequestMapping(value = "/guest**", method = RequestMethod.GET)
	public ModelAndView guestPage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Hello World");
		model.addObject("message", "This is guest  page!");
		
		model.setViewName("guest");

		return model;

	}
	
	@RequestMapping(value = "/user**", method = RequestMethod.GET)
	public ModelAndView userPage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Hello World");
		model.addObject("message", "This is user  page!");
		
		model.setViewName("user");

		return model;

	}

}