package dev.stefan.demo.Rule;

import org.springframework.beans.factory.annotation.Value;

public class MaxLengthRule extends Rule {

	@Value("${length.max}")
	private int maxLength;
	
	@Override
	public boolean validate(String password) {
		return password.length() <= maxLength ? true : false;
	}

}
