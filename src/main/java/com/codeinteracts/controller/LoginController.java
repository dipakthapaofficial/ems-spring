package com.codeinteracts.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	final static Logger logger = LoggerFactory.getLogger(HelloViewController.class);
	
	@GetMapping("/login")
	public String login(Model model) {
		
		model.addAttribute("loginDTO", new LoginDTO());

		model.addAttribute("id", 1);
		return "login";
		
	}
	
	
	@GetMapping("/login-form")
	public String getloginData(Model model, @RequestParam(value="username") String username, @RequestParam(value="password") String password) {
		logger.info("Inside get login data method.....");
		logger.info("Username::::" +username);
		logger.info("Password::::" +password);
		
		model.addAttribute("username", username);
		model.addAttribute("password", password);
		
		return "login";
	}
	
	
	@PostMapping("/login")
	public String postLogin(Model model, @RequestParam(value="username") String username, @RequestParam(value="password") String password, @RequestParam(value="id") Integer id) {
		logger.info("Inside get postLogin method.....");
		logger.info("Username::::" +username);
		logger.info("Password::::" +password);
		logger.info("id::::" +id);
		
		model.addAttribute("username", username);
		model.addAttribute("password", password);
		model.addAttribute("id", id);
		return "login";
	}
	
//	@PostMapping(value="/login-obj", consumes = "application/x-www-form-urlencoded")
//	public String postLoginObject(Model model, @ModelAttribute LoginDTO loginDTO ) {
//		logger.info("Inside get login-obj method.....");
//		
//		logger.info(loginDTO);
//		
//		model.addAttribute("loginDTO", loginDTO);
//		
//		return "login";
//	}
	
	
}
