package com.passwordValidate.Rule;

public abstract class Rule {

	protected String regex;
	
	protected String message;
	
	Rule(String regex, String message){
		this.regex = regex;
		this.message = message;
	}
	
	public abstract boolean check(String password);

	public String getMessage() {
		return message;
	}

}
