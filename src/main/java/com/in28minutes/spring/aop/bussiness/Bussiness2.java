package com.in28minutes.spring.aop.bussiness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in28minutes.spring.aop.data.Dao2;

@Service
public class Bussiness2 {
	
	@Autowired
	private Dao2 dao2;
	
	public String calculateSomething() {
		return dao2.getSomething();
	}

}
