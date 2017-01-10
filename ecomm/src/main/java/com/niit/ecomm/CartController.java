package com.niit.ecomm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = { "/user" })
public class CartController {
	
	
	@RequestMapping(value = { "/cart" })
	public ModelAndView cart() {
			ModelAndView modelandview = new ModelAndView("page");
			modelandview.addObject("title", "Cart");
			modelandview.addObject("ifUserClickedCart", true);
			return modelandview;
		}

}
