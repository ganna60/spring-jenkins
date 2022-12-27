package com.javatechie.jenkin.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@Slf4j
@SpringBootApplication
//@RestController
public class SpringJenkinsApplication {


//	@GetMapping("/ping")
//	public String message() {
//		return "Wao!!! Application successfully deployed in SAP Cloud.";
//	}

	@PostConstruct
	public void intt() {
		log.info("*** Application started...");
	}
	public static void main(String[] args) {
		log.info("*** Application executed...");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
