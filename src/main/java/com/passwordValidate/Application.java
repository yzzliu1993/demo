package com.passwordValidate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.passwordValidate.Bean.PasswrodBean;
import com.passwordValidate.Service.PasswordValidateService;


public class Application {
  
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		PasswordValidateService passwordService = (PasswordValidateService) ctx.getBean("passwordValidateService");
		PasswrodBean passwrodBean = passwordService.validate(args[0]);
		if(passwrodBean.getMessageSet().isEmpty())
			System.out.println(args[0] +"passed");
		
		
		passwrodBean.getMessageSet()
					.forEach(message -> System.out.println(message));
		
	}

}
