package dev.stefan.demo.Valiation;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;

@Component
public class CharRule implements ValidationRule {

	public static final String LETTER_DIGIT_ERROR = "Password consist of a mixture of lowercase letters and numerical digits only, with at least one of each.";
	
	private Pattern upperLetterPattern = java.util.regex.Pattern.compile("[A-Z]");
	private Pattern specialCharPattern = java.util.regex.Pattern.compile("[\\W]");
	private Pattern lowerLetterPattern = java.util.regex.Pattern.compile("^\\d+[a-z]+|^[a-z]+\\d+");

	@Override
	public boolean validate(String password) {

			if(upperLetterPattern.matcher(password).find())
				return false;
				
			if(specialCharPattern.matcher(password).find())
				return false;
			
			if(!lowerLetterPattern.matcher(password).find())
				return false;

		return true;
	}

	@Override
	public String getMessage() {
		return LETTER_DIGIT_ERROR;
	}
	
	
}
