package com.codeinteracts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String sayHello(@RequestParam(value="name", defaultValue = "Hari") String name) {
		System.out.println("Name:::::"+name);
		
//		if (name != null && name != "") {
//			return "hello "+ name;
//		}
		
		return "something";
	}

}
