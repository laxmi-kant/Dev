package com.java.self.practice.Laxmikantbio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.self.practice.Laxmikantbio.modal.Person;
import com.java.self.practice.Laxmikantbio.service.WelcomeService;


@RestController
public class WelcomeController {
@Autowired
WelcomeService service;
	@RequestMapping(value="/")
	public  String get(){
		return "index";
	}
	@RequestMapping(value="/savePerson",method=RequestMethod.POST)
	public Person savePerson(@RequestBody Person person){
		return service.savePerson(person);
	}
	
}
