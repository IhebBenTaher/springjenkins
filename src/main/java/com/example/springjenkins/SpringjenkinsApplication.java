package com.example.springjenkins;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringjenkinsApplication {
	public static Logger logger= LoggerFactory.getLogger(SpringjenkinsApplication.class);
	@PostConstruct
	public void intt(){
		logger.info("app started");
	}
	public static void main(String[] args) {
		logger.info("app executed");
		SpringApplication.run(SpringjenkinsApplication.class, args);
	}

}
