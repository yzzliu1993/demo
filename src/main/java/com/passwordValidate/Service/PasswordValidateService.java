package com.passwordValidate.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.passwordValidate.Bean.PasswrodBean;
import com.passwordValidate.Rule.Rule;

@Component
public class PasswordValidateService implements ValidateService {

	@Autowired
	private List<Rule> ruleList;
	
	public PasswrodBean validate(String password) {
		PasswrodBean passwrodBean = new PasswrodBean();
		
		for(Rule rule : ruleList) {
			if(!rule.check(password))
				passwrodBean.getMessageSet()
						.add(rule.getMessage());
		}
		
		return passwrodBean;
	}

	
}
