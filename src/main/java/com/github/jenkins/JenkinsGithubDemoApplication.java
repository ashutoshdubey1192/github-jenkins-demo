package com.github.jenkins;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.sun.org.slf4j.internal.Logger;
//import com.sun.org.slf4j.internal.LoggerFactory;

@SpringBootApplication
@RestController
public class JenkinsGithubDemoApplication {
	
	Logger logger = LoggerFactory.getLogger(JenkinsGithubDemoApplication.class);
	
	@PostConstruct
	public void initt() {
		logger.info("inside init methode...");
	}
	
	@GetMapping
	public String printHello() {
		logger.info("inside hello message...");
		return "inside hello message";
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsGithubDemoApplication.class, args);
	}

}
