package dev.stefan.demo.Rule;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Value;

public class SpecialCharRule extends Rule {

	@Value("${specialchar.regex}")
	private String specialCharRegex;
	
	@Override
	public boolean validate(String password) {
		return Pattern.matches(specialCharRegex, password) ? false : true;
	}

}
