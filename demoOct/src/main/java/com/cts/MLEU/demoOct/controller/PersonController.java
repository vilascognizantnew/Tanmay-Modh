package com.cts.MLEU.demoOct.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.MLEU.demoOct.Dao.PersonDao;
import com.cts.MLEU.demoOct.Model.Person;
import com.cts.MLEU.demoOct.service.PersonService;
import com.cts.MLEU.demoOct.service.PersonServiceImpl;

@RestController
public class PersonController {

	@Autowired
	PersonService personService;  // Autowire byname  
	
	
	@RequestMapping("/personList")
	public ResponseEntity<Object> personList() {
		return new ResponseEntity<>(personService.getAllPerson(),HttpStatus.OK);
	}
	
	@RequestMapping("/getPersonById/{id}")
	public ResponseEntity<Object> personList(@PathVariable(value="id") Integer id) {
		Person person = personService.getPersonById(id);
		if(person!=null) {
			return new ResponseEntity<>(person,HttpStatus.OK);
		}
		else
			return new ResponseEntity<>("Record not Found",HttpStatus.OK);
	}
	
	@PostMapping(value="/addPerson")
	public ResponseEntity<Object> addPerson(@RequestBody Person person){
		
		return new ResponseEntity<>(personService.addPerson(person),HttpStatus.OK);
	}
	
	@PutMapping(value="/updatePerson")
	public ResponseEntity<Object> updatePerson(@RequestBody Person person){
		Person personTemp = personService.updatePerson(person);
		if(personTemp!=null) {
			return new ResponseEntity<>(person,HttpStatus.OK);
		}
		else	
			return new ResponseEntity<>("Record not Found",HttpStatus.OK);
	}
	
	@RequestMapping(value="/deletePerson/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<Object> deletePerson(@PathVariable("id") Integer id){
		personService.deletePerson(id);
		
		return new ResponseEntity<>("Person Deleted successfully",HttpStatus.OK);
	}
}
