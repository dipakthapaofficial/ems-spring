package com.codeinteracts.controller;

import java.time.LocalDate;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codeinteracts.entity.Person;
import com.codeinteracts.service.PersonService;

@Controller
@RequestMapping("/person")
public class PersonController {
	
	private static final Logger logger = LoggerFactory.getLogger(PersonController.class);
	
	@Autowired
	PersonService personService;
	
	@GetMapping("/create")
	public String renderView(Model model) {
		logger.info("Inside get renderView method.....");
		
		model.addAttribute("person", new Person());
		
		return "person-form";
		
	}
	
	
	@PostMapping("/create")
	public String create(Model model, @RequestParam(value="fn") String firstName, @RequestParam(value="lastName") String lastName, @RequestParam(value="dob", required = false) LocalDate dob) {
		logger.info("Inside get create method.....");
		
		personService.add(firstName, lastName, dob);
		
		return "success";
		
	}
	
	@GetMapping("/detail/{id}")
	public String getByID(Model model, @PathVariable(value = "id") Integer id) {
		logger.info("Inside get getByID method.....");
		
		Person person = personService.getByID(id);
		model.addAttribute("person", person);
		return "person";
		
	}
	
	@GetMapping("/list")
	public String list(Model model) {
		logger.info("Inside get list method.....");
		
		List<Person> persons = personService.getAllPerson();
		logger.info(persons.toString());
		model.addAttribute("persons", persons);
		return "personList";
		
	}
	
	
}
