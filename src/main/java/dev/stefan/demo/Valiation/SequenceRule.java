package dev.stefan.demo.Valiation;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;

@Component
public class SequenceRule implements ValidationRule {

	public static final String SEQUENCE_REPEATED_ERROR = "Password must not contain any sequence of characters immediately followed by the same sequence.";

	private Pattern sequenceRepeatedPattern = java.util.regex.Pattern.compile("(\\w{1,})\\1");

	@Override
	public boolean validate(String password) {
		return sequenceRepeatedPattern.matcher(password).find() ? false : true;
	}

	@Override
	public String getMessage() {
		return SEQUENCE_REPEATED_ERROR;
	}

}
