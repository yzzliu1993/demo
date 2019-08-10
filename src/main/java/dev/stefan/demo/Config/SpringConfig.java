package dev.stefan.demo.Config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.annotation.Order;

import dev.stefan.demo.Service.PasswordService;
import dev.stefan.demo.Valiation.CharRule;
import dev.stefan.demo.Valiation.LengthRule;
import dev.stefan.demo.Valiation.SequenceRule;
import dev.stefan.demo.Valiation.ValidationRule;

@Configuration
@PropertySource("classpath:passwordRule.properties")
public class SpringConfig {

	@Bean
	public PasswordService passwordService() {
		return new PasswordService();
	}

	@Bean
	public LengthRule lengthRule() {
		return new LengthRule();
	}

	@Bean
	public CharRule charRule() {
		return new CharRule();
	}

	@Bean
	public SequenceRule sequenceRule() {
		return new SequenceRule();
	}

	@Bean
	public List<ValidationRule> passwordRuleList() {
		return Arrays.asList(lengthRule(), charRule(), sequenceRule());
	}

}
