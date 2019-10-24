package dev.stefan.demo.Service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import dev.stefan.demo.Rule.Rule;

@Component
public class PasswordService extends ValidationService {

	@Override
	public void validate(String password) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		List<Rule> ruleList = (List<Rule>) ctx.getBean("ruleList");
		
		
		for(Rule rule : ruleList)
			System.out.println( rule.validate(password));
	}

}
