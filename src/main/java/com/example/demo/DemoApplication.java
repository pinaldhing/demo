package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("hello world!");
		System.out.println("my name is bhavya");
		System.out.println("my age is 21");
		SpringApplication.run(DemoApplication.class, args);
	}

}
