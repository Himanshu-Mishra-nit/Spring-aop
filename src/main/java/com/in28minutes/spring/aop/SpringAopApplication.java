package com.in28minutes.spring.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.spring.aop.aspect.BeforeAspect;
import com.in28minutes.spring.aop.bussiness.Bussiness1;
import com.in28minutes.spring.aop.bussiness.Bussiness2;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner{

	private Logger logger=  LoggerFactory.getLogger(BeforeAspect.class);
	
	@Autowired
	private Bussiness1 bussiness1;
	
	@Autowired
	private Bussiness2 bussiness2; 
	
	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info(bussiness1.calculateSomething());
		logger.info(bussiness2.calculateSomething());
		
	}

}
