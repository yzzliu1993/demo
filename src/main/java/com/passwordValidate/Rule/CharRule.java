package com.passwordValidate.Rule;

import java.util.regex.Pattern;

/**
 * This is a char rule for password.
 * Must consist of a mixture of lowercase letters and numerical digits only, with at least one of each.
 * @author liuyouzhu
 *
 */
public class CharRule extends Rule {

	public CharRule(String regex, String message) {
		super(regex, message);
	}

	@Override
	public boolean check(String password) {
		return Pattern.matches(regex, password)? true : false;
	}

}
