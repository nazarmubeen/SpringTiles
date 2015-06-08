package com.controller;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView;  

@Controller
public class HelloWorldController {

	@RequestMapping("/hello")
	public ModelAndView helloworld(){
		String message="this is hello world";
		return new ModelAndView("hello","message",message);
		
	}
	
}
