package com.in28minutes.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeAspect {
	
	
	private Logger logger=  LoggerFactory.getLogger(BeforeAspect.class);
	
	@Before("execution(* com.in28minutes.spring.aop.bussiness.*.*(..))")
	public void before() {
		logger.info("intercept method called");
		
	}
	
	@Before("execution(* com.in28minutes.spring.aop.bussiness.*.*(..))")
	public void beforeWithJoint(JoinPoint joinPoint) {
		logger.info("intercept method called - {}", joinPoint);
		
	}

}
