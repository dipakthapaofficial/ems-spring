package com.codeinteracts.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codeinteracts.dao.PersonDao;
import com.codeinteracts.entity.Person;
import com.codeinteracts.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	
	private static final Logger logger = LoggerFactory.getLogger(PersonServiceImpl.class);
	
	@Autowired
	PersonDao personDao;
	

	@Override
	public void add(String firstName, String lastName, LocalDate dob) {
		logger.info("Inside create method..");
		Person person = new Person();
		person.setDob(dob);
		person.setFname(firstName);
		person.setLastName(lastName);
		
		//Call DAO
		personDao.save(person);
	}


	@Override
	public Person getByID(Integer id) {
		logger.info("Inside getByID..");
		logger.info("ID"+id);
		return personDao.getById(id);
	}


	@Override
	public List<Person> getAllPerson() {
		logger.info("Inside getAllPerson..");
		List<Person> persons = personDao.findAll();
		return persons;
	}

}
