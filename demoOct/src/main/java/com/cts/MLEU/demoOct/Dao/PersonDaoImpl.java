package com.cts.MLEU.demoOct.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cts.MLEU.demoOct.Model.Person;

@Component
public class PersonDaoImpl implements PersonDao{

	List<Person> personList = new ArrayList<Person>();
	
	public PersonDaoImpl() {
		personList.add(new Person(101,"Tanmay",25));
		personList.add(new Person(102,"Ta",22));
		personList.add(new Person(103,"Tanm",23));
	}
	@Override
	public List<Person> getAllPerson() {
		
		return personList;
	}

	@Override
	public Person getPersonById(int id) {
		
		for(Person p : personList) {
			if(p.getId() == id)
				return p;
		}
		return null; 	
	}

	@Override
	public Person addPerson(Person person) {
		// TODO Auto-generated method stub
		personList.add(person);
		return person;
	}

	@Override
	public Person updatePerson(Person person) {
		// TODO Auto-generated method stub
		int index = 0;
		for(Person personTemp : personList) {
			if(personTemp.getId() == person.getId()) {
				personList.set(index,person);
				return personTemp;
			}
			index ++; 
		}
		return null;
	}

	@Override
	public int deletePerson(int id) {
		// TODO Auto-generated method stub
		for(Person p : personList) {
			if(p.getId() == id)
				personList.remove(id);
		}
		return 0;
	}

	
}
