package com.cts.MLEU.demoOct.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.MLEU.demoOct.Dao.PersonDao;
import com.cts.MLEU.demoOct.Dao.PersonDaoImpl;
import com.cts.MLEU.demoOct.Model.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonDao personDao;

	@Override
	public List<Person> getAllPerson() {
		// TODO Auto-generated method stub
		return personDao.getAllPerson();
	}

	@Override
	public Person getPersonById(int id) {
		// TODO Auto-generated method stub
		return personDao.getPersonById(id);
	}

	@Override
	public Person addPerson(Person person) {
		// TODO Auto-generated method stub
		return personDao.addPerson(person);
	}

	@Override
	public Person updatePerson(Person person) {
		// TODO Auto-generated method stub
		return personDao.updatePerson(person);
	}

	@Override
	public int deletePerson(int id) {
		// TODO Auto-generated method stub
		return personDao.deletePerson(id);
	}

}
