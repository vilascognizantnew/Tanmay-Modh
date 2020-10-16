package com.cts.MLEU.demoOct.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.MLEU.demoOct.Model.Person;

@RestController
public class DemoController {
	
	
	@RequestMapping("/hello")
	public String helloPage() {
		return "Hello! How are you Doing";
	}
}
