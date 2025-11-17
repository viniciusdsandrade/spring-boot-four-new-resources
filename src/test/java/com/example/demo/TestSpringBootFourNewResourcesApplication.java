package com.example.demo;

import org.springframework.boot.SpringApplication;

public class TestSpringBootFourNewResourcesApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringBootFourNewResourcesApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
