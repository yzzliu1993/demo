package dev.stefan.demo.Valiation;

public interface ValidationRule {

	public boolean validate(String passwords);
	
	public String getMessage();
}
