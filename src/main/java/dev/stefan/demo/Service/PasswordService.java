package dev.stefan.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dev.stefan.demo.Valiation.ValidationRule;

@Component
public class PasswordService {

	@Autowired
	private List<ValidationRule> passwordRuleList;

	public String validate(String password) {
		String errorMsg = "";
		
		for(int i = 0 ; i < passwordRuleList.size() ; i++) {
			ValidationRule validationRule = passwordRuleList.get(i);
			if(!validationRule.validate(password)) {
				errorMsg = validationRule.getMessage();
				break;
			}
		}

		return errorMsg;
	}

}
