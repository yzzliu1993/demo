package dev.stefan.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dev.stefan.demo.Service.PasswordService;

public class Application {
  
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		PasswordService passwordService = (PasswordService) ctx.getBean("passwordService");
		
		passwordService.validate(args[0]);
		
	}

}
