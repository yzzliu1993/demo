package com.passwordValidate.Rule;

import java.util.regex.Pattern;

public class SequenceRule extends Rule {

	public SequenceRule(String regex, String message) {
		super(regex, message);
	}

	@Override
	public boolean check(String password) {
		return Pattern.matches(regex, password) ? true : false;
	}

}
