package com.everis.bootcamp.webfluxservermicro.repository;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
	
	public String firstname;
	
	public String lastname;
	
	public int age;

	public Person(String name, String surname, int age) {
		this.firstname = name;
		this.lastname = surname;
		this.age = age;
	}
	
}
