package dev.stefan.demo.Rule;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Value;

public class NumericalDigitsRule extends Rule {

	
	@Value("${numericaldigits.regex}")
	private String numericaldigitsRegex;
	
	@Override
	public boolean validate(String password) {
		return Pattern.matches(numericaldigitsRegex, password) ? true : false;
	}

}
