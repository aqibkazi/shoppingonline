package com.niit.ecomm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value = {"/", "/index"})
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("page");
		//send an object to decide which page to load
		mv.addObject("ifUserClickedHome", true);	
		mv.addObject("title", "home");	
    	return mv;
			
	}
	
	@RequestMapping(value = "/about")
	public ModelAndView about() {
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("ifUserClickedAbout", true);	
		mv.addObject("title", "About");
		return mv;
	
	}
	
	@RequestMapping(value = "/contact")
	public ModelAndView contact() {
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("ifUserClickedContact", true);	
		mv.addObject("title", "contact");
		return mv;
	
	
	}
	

}	
	



	