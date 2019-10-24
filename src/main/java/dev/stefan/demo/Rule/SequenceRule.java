package dev.stefan.demo.Rule;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Value;

public class SequenceRule extends Rule {

	@Value("${sequence.regex}")
	private String sequenceRegex;
	
	@Override
	public boolean validate(String password) {
		return Pattern.matches(sequenceRegex, password) ? true : false;
	}

}
