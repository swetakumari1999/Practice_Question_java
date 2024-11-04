package com.Spring_jdbc_to_jpa.spring_database_demo;

import com.Spring_jdbc_to_jpa.spring_database_demo.dao.PersonJdbcDao;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class SpringDatabaseDemoApplication implements CommandLineRunner
{
	private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJdbcDao dao;

	public static void main(String[] args) {
		SpringApplication.run(SpringDatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println(dao.findAll());
	}
}
