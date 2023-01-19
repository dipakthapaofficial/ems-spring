package com.codeinteracts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloViewController {
	
	@GetMapping("/greet")
	public String sayHello(Model model) {
		System.out.println("Inside say hello method.. HelloViewController");
		return "something";
	}
	
	@GetMapping("/ola")
	public String sayOla() {
		System.out.println("Inside say ola method.. HelloViewController");
		return "ola1";
	}
	
}
