package com.codeinteracts.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	final static Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	@GetMapping("/hello")
	public String sayHello(@RequestParam(value="name", defaultValue = "Hari") String name) {
		System.out.println("Name:::::"+name);
		logger.info("Name:::::"+name);
		try {
			if (name != null && name != "") {
				return "hello "+ name;
			}
		} catch(Exception e) {
			logger.error(e.getMessage());
			logger.error(name, e.getStackTrace());
		}
		
		
		
		return "something";
	}

}
