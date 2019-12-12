package com.passwordValidate.Service;

import org.springframework.stereotype.Component;

import com.passwordValidate.Bean.PasswrodBean;

public interface ValidateService {

	public PasswrodBean validate(String password);
	
}
