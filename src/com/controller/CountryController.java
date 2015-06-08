package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.form.Country;

@Controller
public class CountryController {

	ModelAndView mav=null;
	
	@ModelAttribute("countrylist")
	public ArrayList<String> getCountry()
	{
		ArrayList<String> countryList = new ArrayList<String>();
		countryList.add("India");
		countryList.add("Australia");
		countryList.add("England");
		return countryList;
		
	}
	
}