package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes
public class LearningController {

	@RequestMapping("/learning")
	public ModelAndView learn()
	{
		String messages="this is not a learning page";
		return new ModelAndView("learning","messages",messages);
	}
	
}
