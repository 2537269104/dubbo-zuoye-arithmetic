package com.liuhao.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liuhao.service.ArithmeticService;

public class ConsumerStart {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");
		
		ArithmeticService arithmeticService = context.getBean(ArithmeticService.class);
		
		
		int add = arithmeticService.add(10, 20);
		System.out.println("10+20="+add);
		
		int multiply = arithmeticService.multiply(20, 10);
		System.out.println("20-10="+multiply);
		
	}
}
