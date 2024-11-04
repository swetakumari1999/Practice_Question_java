package com.Spring_AOP;

import com.Spring_AOP.business.Business1;
import com.Spring_AOP.business.Business2;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;


@SpringBootApplication
@Slf4j
public class SpringAopDemoApplication implements CommandLineRunner
{

	//private Logger logger = LoggerFactory.getLogger(this.getClass());
  @Autowired
	private Business1 business1;
  @Autowired
	private Business2 business2;

	public static void main(String[] args) {

		SpringApplication.run(SpringAopDemoApplication.class, args);
	}

@Override
	public void run(String[] args) throws Exception
	{
		System.out.println(business1.somethingCalculate());
		log.info(business1.somethingCalculate());
		log.info(business2.somethingCalculate());
	}
}
