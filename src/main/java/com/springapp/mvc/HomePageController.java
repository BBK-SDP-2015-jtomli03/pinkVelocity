package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomePageController {

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome() {
		//model.addAttribute("message", "Hello world!");
//		ModelAndView model = new ModelAndView("index");
//		model.addObject("products", ProductCatalogue.getCatalogue().getProducts());
//		return model; //return a view
		return "index";
	}

	// Add one attribute
	// The return value of the method is added to the model under the name "account"
	// You can customize the name via @ModelAttribute("myAccount")
//	@ModelAttribute("catalogue")
//	public List<String> addCatalogue() {
//		return catalogue.getProducts();
//	}
}