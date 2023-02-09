package com.everis.bootcamp.webfluxdemo.controller;

import java.time.Duration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.bootcamp.webfluxdemo.repository.Subscriber;

import reactor.core.publisher.Flux;

@RestController
public class Controller {

	@GetMapping(path = "/numbers", produces = "text/event-stream")
	public Flux<Integer> numbers() {

		Flux<Integer> flux = Flux.range(1, 30).delayElements(Duration.ofSeconds(1));
		return flux;

		// Otra solución
//		return Flux.interval(Duration.ofSeconds(1))
//				.map(n -> (int) (long) n + 1)
//				.take(30);
	}
	
	@GetMapping(path="/numbers-with-subscribers", produces= "text/event-stream")
	public Flux<Integer> numbersWithSubscribers(){
		
		Flux<Integer> flux = Flux.range(1, 30).delayElements(Duration.ofSeconds(1));
		
		flux.subscribe(n -> Subscriber.print(n)); // Subscriptor 1
		flux.subscribe(n -> System.out.println("Subscriber 2: " + n)); // Suscriptor 2
		
		return flux;
	}

}
