package com.cts.MLEU.demoOct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cts.MLEU.demoOct")
public class DemoOctApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoOctApplication.class, args);
	}

}
