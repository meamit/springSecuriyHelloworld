package com.hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	
	@RequestMapping(value = "/login**", method = RequestMethod.GET)
	public ModelAndView dologin() {

		ModelAndView model = new ModelAndView();
		
		model.setViewName("login");
		return model;

	}

}
