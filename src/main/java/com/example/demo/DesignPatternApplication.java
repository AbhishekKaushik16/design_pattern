package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternApplication {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance("FOO");
		Singleton singleton1 = Singleton.getInstance("BAR");
		System.out.println(singleton.value);
		System.out.println(singleton1.value);
		SpringApplication.run(DesignPatternApplication.class, args);
	}

}
