package com.controller;
import org.springframework.stereotype.Controller;  
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;  
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.bind.annotation.SessionAttributes;  
import org.springframework.web.servlet.ModelAndView;  
import com.form.Contact;

import freemarker.ext.beans.MapModel;


@Controller
@SessionAttributes
public class ContactController {
	
	
	
	
	@RequestMapping(value="/addcontact",method=RequestMethod.POST)
	public String addContact(@ModelAttribute("contact") Contact contact, BindingResult result, ModelMap model) {  
     
		
		//write the code here to add contact 
		
		model.addAttribute("firstname",contact.getFirstname());
		model.addAttribute("lastname",contact.getLastname());
		model.addAttribute("email", contact.getEmail());
		model.addAttribute("telephone",contact.getTelephone());
		
		System.out.println(contact.getFirstname());
		
   // return "redirect:addcontact.html";  
	return "addcontact";
    }  
	
	
	 @RequestMapping("/contact")  
	    public ModelAndView addContacts() {  
	        return new ModelAndView("contact", "command", new Contact());  
	    } 
	 
	 
}
