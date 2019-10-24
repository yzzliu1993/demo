package dev.stefan.demo.Rule;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Value;

public class UpperCharRule extends Rule {

	@Value("${upperchar.regex}")
	private String upperCharRegex;
	
	@Override
	public boolean validate(String password) {
		return Pattern.matches(upperCharRegex, password) ? false : true;
	}

}
