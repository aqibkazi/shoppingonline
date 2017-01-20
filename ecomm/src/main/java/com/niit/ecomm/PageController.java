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


	@RequestMapping(value = "/register")
	public ModelAndView signup() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "register");
		mv.addObject("ifUserClickedRegister", true);
		return mv;
	}
	
	@RequestMapping(value = "/login")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Login");
		mv.addObject("ifUserClickedLogin", true);
		return mv;
	}
	
	@RequestMapping(value = "/productlist")
	public ModelAndView productlist() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Product List");
		mv.addObject("ifUserClickedProductList", true);
		return mv;
	}
	
	@RequestMapping(value = "/cart")
	public ModelAndView cart() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Cart");
		mv.addObject("ifUserClickedCart", true);
		return mv;
	}
	
	@RequestMapping(value = "/adminpanels")
	public ModelAndView admin() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "admin");
		mv.addObject("ifUserClickedAdmin", true);
		return mv;
	}
	
	@RequestMapping(value = "/userpanels")
	public ModelAndView user() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "admin");
		mv.addObject("ififUserClickedUser", true);
		return mv;
	}
	
	/* End of the loading product page */
}
	


	



	