package com.everis.bootcamp.webfluxappmicro.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import com.everis.bootcamp.webfluxappmicro.repository.Person;
import reactor.core.publisher.Flux;

@Service
public class PersonService {

	WebClient client1 = WebClient.create("http://localhost:8080/person-list-1");
	WebClient client2 = WebClient.create("http://localhost:8080/person-list-2");
	WebClient client3 = WebClient.create("http://localhost:8080/person-list-3");
	WebClient client4 = WebClient.create("http://localhost:8080/person-list-4");

	public Flux<Person> allPerson() {

		Flux<Person> flux = client1.get().retrieve().bodyToFlux(Person.class);

		Flux<Person> allPerson = Flux.merge(client1.get().retrieve().bodyToFlux(Person.class),
				client2.get().retrieve().bodyToFlux(Person.class), client3.get().retrieve().bodyToFlux(Person.class),
				client4.get().retrieve().bodyToFlux(Person.class));

		return flux;

	}

}
