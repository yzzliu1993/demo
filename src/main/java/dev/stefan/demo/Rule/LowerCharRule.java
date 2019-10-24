package dev.stefan.demo.Rule;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Value;

public class LowerCharRule extends Rule {

	@Value("${lowerchar.regex}")
	private String lowerCharRegex;
	
	@Override
	public boolean validate(String password) {
		return Pattern.matches(lowerCharRegex, password) ? true : false;
	}

}
