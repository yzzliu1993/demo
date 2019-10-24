package dev.stefan.demo.Rule;

import org.springframework.beans.factory.annotation.Value;

public class MinLengthRule extends Rule {

	@Value("${length.min}")
	private int minLength;
	
	@Override
	public boolean validate(String password) {
		return password.length() >= minLength ? true : false;
	}

}
