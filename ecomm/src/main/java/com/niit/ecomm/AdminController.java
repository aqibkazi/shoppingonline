package com.niit.ecomm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = { "/admin" })
public class AdminController {
	
	@RequestMapping(value = { "/addproduct" })
	public ModelAndView getAddProductPage() {
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("title", "Add Product");
		modelAndView.addObject("ifUserClickedAddProduct", true);
		return modelAndView;
	}
	
	@RequestMapping(value = { "/addcategory" })
	public ModelAndView getAddCategoryPage() {
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("title", "Add Category");
		modelAndView.addObject("ifUserClickedAddCategory", true);
		return modelAndView;
	}
	
	@RequestMapping(value = { "/addsupplier" })
	public ModelAndView getAddSupplierPage() {
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("title", "Add Supplier");
		modelAndView.addObject("ifUserClickedAddSupplier", true);
		return modelAndView;
	}
}

	
