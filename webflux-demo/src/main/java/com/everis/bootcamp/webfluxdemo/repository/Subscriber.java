package com.everis.bootcamp.webfluxdemo.repository;

public class Subscriber {

	public static void print(Integer n) {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Subscriber 1" + n);
	}

}
