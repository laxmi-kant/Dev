package com.java.self.practice.Laxmikantbio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.self.practice.Laxmikantbio.dao.WelcomeDao;
import com.java.self.practice.Laxmikantbio.modal.Person;

@Service
public class WelcomeService {
@Autowired
private WelcomeDao dao;

public Person savePerson(Person person){
	return dao.save(person);
}

}
