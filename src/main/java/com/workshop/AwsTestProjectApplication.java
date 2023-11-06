package com.workshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsTestProjectApplication {

	@GetMapping("/")
	public String home() {
		return "welcome to the aws asto";
	}
	public static void main(String[] args) {
		SpringApplication.run(AwsTestProjectApplication.class, args);
	}

}
