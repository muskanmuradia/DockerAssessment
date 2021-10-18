package com.m3assessment.DockerSpringBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerSpringBootAppApplication {
	
	@RequestMapping("/")
	  public String test() {
	    return "Hello! This is Muskan Muradia from JEE Cloud Batch 2.";
	  }

	public static void main(String[] args) {
		SpringApplication.run(DockerSpringBootAppApplication.class, args);
	}

}
