package com.java.self.practice.Laxmikantbio.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.self.practice.Laxmikantbio.modal.Person;
@Repository
public interface WelcomeDao extends CrudRepository<Person, Integer> {

}
