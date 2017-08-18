package com.java.self.practice.Laxmikantbio.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="Person")
@Entity
public class Person {
@Id
@Column(name="person_id")
private int personId;

@Column(name="person_name")
private String personName;

@Column(name="profession")
private String profession;

public int getPersonId() {
	return personId;
}

public void setPersonId(int personId) {
	this.personId = personId;
}

public String getPersonName() {
	return personName;
}

public void setPersonName(String personName) {
	this.personName = personName;
}

public String getProfession() {
	return profession;
}

public void setProfession(String profession) {
	this.profession = profession;
}

}
