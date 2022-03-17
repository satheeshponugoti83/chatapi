package com.arthimetic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.arthimetic"})
public class ArthimeticOperationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArthimeticOperationApplication.class, args);
	}

}
