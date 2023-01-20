package com.codeinteracts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@GetMapping("/login")
	public String login(Model model) {
		
		model.addAttribute("loginDTO", new LoginDTO());

		model.addAttribute("id", 1);
		return "login";
		
	}
	
	
	@GetMapping("/login-form")
	public String getloginData(Model model, @RequestParam(value="username") String username, @RequestParam(value="password") String password) {
		System.out.println("Inside get login data method.....");
		System.out.println("Username::::" +username);
		System.out.println("Password::::" +password);
		
		model.addAttribute("username", username);
		model.addAttribute("password", password);
		
		return "login";
	}
	
	
	@PostMapping("/login")
	public String postLogin(Model model, @RequestParam(value="username") String username, @RequestParam(value="password") String password, @RequestParam(value="id") Integer id) {
		System.out.println("Inside get postLogin method.....");
		System.out.println("Username::::" +username);
		System.out.println("Password::::" +password);
		System.out.println("id::::" +id);
		
		model.addAttribute("username", username);
		model.addAttribute("password", password);
		model.addAttribute("id", id);
		return "login";
	}
	
//	@PostMapping(value="/login-obj", consumes = "application/x-www-form-urlencoded")
//	public String postLoginObject(Model model, @ModelAttribute LoginDTO loginDTO ) {
//		System.out.println("Inside get login-obj method.....");
//		
//		System.out.println(loginDTO);
//		
//		model.addAttribute("loginDTO", loginDTO);
//		
//		return "login";
//	}
	
	
}
