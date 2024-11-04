package com.Spring_jdbc_to_jpaMysql.spring_database_demo_Mysql;

import com.Spring_jdbc_to_jpaMysql.spring_database_demo_Mysql.Dao.PersonJdbcDao;
import com.Spring_jdbc_to_jpaMysql.spring_database_demo_Mysql.entities.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringDatabaseDemoMysqlApplication implements CommandLineRunner {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	@Autowired
	PersonJdbcDao dao;
	public static void main(String[] args) {
		SpringApplication.run(SpringDatabaseDemoMysqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("All user -> {}",dao.findAll());
		log.info(" user id 1001 -> {}",dao.findById(1001));
		log.info(" deleted id 1002 -> {}",dao.deleteById(1002));
		log.info(" Inserting 1004 -> {}",dao.insert(new Person(1006, "Ram","adh", new Date())));
	}
}
