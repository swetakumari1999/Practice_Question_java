package com.spring.someproperties_Spring_Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:app.properties")
@SpringBootApplication
public class SomePropertiesSpringProjectApplication {

	public static void main(String[] args) {
	//	SpringApplication.run(SomePropertiesSpringProjectApplication.class, args);
		    ApplicationContext context = SpringApplication.run(SomePropertiesSpringProjectApplication.class, args);
		someExternalUrl service = context.getBean(someExternalUrl.class);
		System.out.println(service.returnServiceUrl());
		}
	}

