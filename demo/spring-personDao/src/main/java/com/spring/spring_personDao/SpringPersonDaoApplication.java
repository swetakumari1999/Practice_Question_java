package com.spring.spring_personDao;

import com.spring.xmljdbcconnection.XmlPersonDao;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
//@Configuration
//@ComponentScan("com.spring.xmljdbcconnection")
@ComponentScan("com.spring.spring_personDao")
public class SpringPersonDaoApplication {

	public static void main(String[] args) {
		 SpringApplication.run(SpringPersonDaoApplication.class, args);
	// PersonDao personDao = context.getBean(PersonDao.class);
		ApplicationContext context = new ClassPathXmlApplicationContext("XmlApplicationContext.xml");
		XmlPersonDao xmlPersonDao = context.getBean(XmlPersonDao.class);

	}


}
