package com.everis.bootcamp.webfluxservermicro.controller;

import java.time.Duration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.bootcamp.webfluxservermicro.repository.Person;

import reactor.core.publisher.Flux;

@RestController
public class PersonListController {
	
	@GetMapping("/person-list-1")
	public Flux<Person> personList1(){
		
		return Flux.just(new Person("Persona1", "Garcia", 8), new Person("Persona2", "Gonzalez", 30))
				.delayElements(Duration.ofSeconds(3));
		
	}
	
	@GetMapping("/person-list-2")
	public Flux<Person> personList2(){

		return Flux.just(new Person("Persona3", "Garcia", 88), new Person("Persona4", "Gonzalez", 36))
				.delayElements(Duration.ofSeconds(3));
		
	}
	
	@GetMapping("/person-list-3")
	public Flux<Person> personList3(){
		
		return Flux.just(new Person("Persona5", "Garcia", 18), new Person("Persona6", "Gonzalez", 68))
				.delayElements(Duration.ofSeconds(3));
		
	}
	
	@GetMapping("/person-list-4")
	public Flux<Person> personList4(){

		return Flux.just(new Person("Persona7", "Garcia", 25), new Person("Persona8", "Gonzalez", 50))
				.delayElements(Duration.ofSeconds(3));
		
	}
	

}
