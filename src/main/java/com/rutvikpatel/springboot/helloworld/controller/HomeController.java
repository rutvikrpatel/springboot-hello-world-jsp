package com.rutvikpatel.springboot.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET )
	public String hello(Model model){
		model.addAttribute("title", "Spring Boot - Hello World Example Jsp");
		return "index";
	}
	
}