package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternApplication {

	public static void main(String[] args) {
		Player player = new Player();
		UI ui = new UI(player);
		ui.init();

		SpringApplication.run(DesignPatternApplication.class, args);
	}

}
