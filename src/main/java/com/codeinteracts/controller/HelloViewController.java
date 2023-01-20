package com.codeinteracts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloViewController {
	
	@GetMapping("/greet")
	public String sayHello(Model model) {
		System.out.println("Inside say hello method.. HelloViewController");
		model.addAttribute("methodName", "greet12312312312");
		return "something";
	}
	
	@GetMapping("/ola")
	public String sayOla(Model model) {
		System.out.println("Inside say ola method.. HelloViewController");
		model.addAttribute("methodName", "ola");
		return "something";
	}
	
}
