package com.codeinteracts.service;

import java.time.LocalDate;
import java.util.List;

import com.codeinteracts.entity.Person;

public interface PersonService {
	
	public void add(String firstName, String lastName, LocalDate dob);

	public Person getByID(Integer id);

	public List<Person> getAllPerson();
	
	
}
