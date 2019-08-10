package dev.stefan.demo.Valiation;

import org.springframework.beans.factory.annotation.Value;

public class LengthRule implements ValidationRule {
	
	public static final String LENGTH_ERROR = "Length should be 5 or 12.";

	@Value("${password.length.min}")
	private int min;
	
	@Value("${password.length.max}")
	private int max;
	
	@Override
	public boolean validate(String password){
		
		return password == null || password.trim().length() < min|| password.trim().length() > max ?
				false : true;
			
	}


	@Override
	public String getMessage() {
		return LENGTH_ERROR;
	}
	

}
