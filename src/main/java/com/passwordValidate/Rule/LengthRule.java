package com.passwordValidate.Rule;

import java.util.regex.Pattern;

/**
 * This is a length rule for password.
 * Must be between 5 and 12 characters in length.
 * @author liuyouzhu
 *
 */
public class LengthRule extends Rule {

	LengthRule(String regex, String message) {
		super(regex, message);
	}

	@Override
	public boolean check(String password) {
		return Pattern.matches(regex, password) ? true : false;
	}

}
