package com.controller;

import javax.servlet.http.HttpServletRequest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.form.Customer;

@SuppressWarnings("deprecation")

public class CustomerFormController extends SimpleFormController{

	public SimpleFormController(){
		setCommandClass(Customer.class);
		setCommandName("customerForm");
	}
	
	@Override
	protected Object formBackingObject(HttpServletRequest request)
		throws Exception {
 
		Customer cust = new Customer();
 
		//make "Spring" as the default java skills selection
		cust.setJavaskills("Spring");
 
		return cust;
 
	}
	
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
		HttpServletResponse response, Object command, BindException errors)
		throws Exception {
 
		Customer customer = (Customer)command;
		return new ModelAndView("CustomerSuccess","customer",customer);
 
	}
 
	
	
	
	@SuppressWarnings({ "unchecked", "rawtypes"})
	protected Map referenceData(HttpServletRequest request) throws Exception {
		 
		@SuppressWarnings("rawtypes")
		Map referenceData = new HashMap();
 
		Map<String,String> country = new LinkedHashMap<String,String>();
		country.put("US", "United Stated");
		country.put("CHINA", "China");
		country.put("SG", "Singapore");
		country.put("MY", "Malaysia");
		referenceData.put("countryList", country);
 
		Map<String,String> javaSkill = new LinkedHashMap<String,String>();
		javaSkill.put("Hibernate", "Hibernate");
		javaSkill.put("Spring", "Spring");
		javaSkill.put("Apache Wicket", "Apache Wicket");
		javaSkill.put("Struts", "Struts");
		referenceData.put("javaSkillsList", javaSkill);
 
		return referenceData;
	}
}
