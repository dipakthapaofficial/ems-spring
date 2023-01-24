package com.codeinteracts.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloViewController {
	
	final static Logger logger = LoggerFactory.getLogger(HelloViewController.class);
	
	@GetMapping("/greet")
	public String sayHello(Model model) {
//		System.out.println("Inside say hello method.. HelloViewController");
		logger.info("Inside say Hello method.. ");
		
		
		
		model.addAttribute("methodName", "greet12312312312");
		
		logger.info("About to exit sayHello method");
		return "something";
	}
	
	@GetMapping("/ola")
	public String sayOla(Model model) {
		System.out.println("Inside say ola method.. HelloViewController");
		model.addAttribute("methodName", "ola");
		return "something";
	}
	
}
