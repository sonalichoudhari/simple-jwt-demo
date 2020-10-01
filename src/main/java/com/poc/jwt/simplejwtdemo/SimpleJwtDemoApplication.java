package com.poc.jwt.simplejwtdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.poc.jwt")
public class SimpleJwtDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleJwtDemoApplication.class, args);
	}

}
