package com.in28minutes.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAspect {
	private Logger logger=  LoggerFactory.getLogger(AfterAspect.class);
	
	
	@AfterReturning(value = "execution(* com.in28minutes.spring.aop.bussiness.*.*(..))",
			returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		logger.info("{} returned the value {}", joinPoint, result);
	}
	
	@AfterThrowing(value = "execution(* com.in28minutes.spring.aop.bussiness.*.*(..))",
			throwing = "exception")
	public void afterThrowing(JoinPoint joinPoint, Object exception) {
		logger.info("{} throw exeption {}",joinPoint, exception);
	}
	
	@After(value = "execution(* com.in28minutes.spring.aop.bussiness.*.*(..))")
	public void after(JoinPoint joinPoint) {
		logger.info("after execution of  {}",joinPoint);
	}
	

}
