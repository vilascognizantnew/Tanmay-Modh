package com.cts.MLEU.demoOct.service;

import java.util.List;

import com.cts.MLEU.demoOct.Model.Person;

public interface PersonService {

	public List<Person> getAllPerson();

	public Person getPersonById(int id);

	public Person addPerson(Person person);

	public Person updatePerson(Person person);
	
	public int deletePerson(int id);

}
