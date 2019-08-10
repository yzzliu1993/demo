package dev.stefan.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.stefan.demo.Config.SpringConfig;
import dev.stefan.demo.Service.PasswordService;

public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		PasswordService passwordService = (PasswordService) ctx.getBean(PasswordService.class);
		String erroMsg = passwordService.validate(args.length == 0 ? null : args[0]);
		System.out.println(erroMsg);
	}

}
