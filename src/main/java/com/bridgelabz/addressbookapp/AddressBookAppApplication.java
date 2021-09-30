package com.bridgelabz.addressbookapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class AddressBookAppApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(AddressBookAppApplication.class, args);
		log.info("AddressBook App started in {} Envoronment",
				context.getEnvironment().getProperty("environment"));
		log.info("AddressBook App started in {} Envoronment",
				context.getEnvironment().getProperty("spring.datasource.username"));
	}
}
