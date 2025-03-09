package com.emp.track;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
 //@SpringBootApplication is a convenience annotation that combines @EnableAutoConfiguration, @ComponentScan, and @Configuration, enabling auto-configuration, component scanning, and configuration management in a Spring Boot application.
public class EmpTrackApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpTrackApplication.class, args);
	}

}
