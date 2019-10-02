package dev.stefan.demo.ValidationNew;

public abstract class ValidateRule {

	public abstract boolean validate(String passwords);
	
	public abstract String getMessage();
}
