package com.Spring_jpaMysql.spring_jpa_demo_Mysql;

import com.Spring_jpaMysql.spring_jpa_demo_Mysql.entities.Person;
import com.Spring_jpaMysql.spring_jpa_demo_Mysql.rep.PersonRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringJpaDemoMysqlApplication implements CommandLineRunner {
	private Logger log = LoggerFactory.getLogger(this.getClass());
	@Autowired
	PersonRepo repo;
	public static void main(String[] args) {

		SpringApplication.run(SpringJpaDemoMysqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("find user -> {}",repo.findById(1001));


		log.info("Inserting 1006 -> Rows inserted: {}", repo.insert(new Person(1004, "Ram", "adh", new Date())));
		log.info("Updating 1006 -> Rows inserted: {}", repo.insert(new Person(1006, "Ram", "adh", new Date())));
	     repo.deletedById(1006);
	}
}
