package dev.stefan.demo.Validation;

import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import dev.stefan.demo.Config.SpringConfigTest;
import dev.stefan.demo.Valiation.CharRule;

public class CharRuleTest extends SpringConfigTest {

	@Autowired
	private CharRule charRule;

	public static final String Single_Upper_Letter = "deMotest";
	public static final String Upper_Letters_Only = "DEMOTEST";
	public static final String Single_Special_Char = "#demo123";
	public static final String Special_Letters_Only = "#$%$%";
	public static final String Lower_Letters_Only = "demotest";
	public static final String Digits_Only = "123456";

	@Test
	public void test1() {
		assertFalse(charRule.validate(Single_Upper_Letter));

	}

	@Test
	public void test2() {
		assertFalse(charRule.validate(Upper_Letters_Only));
	}

	@Test
	public void test3() {
		assertFalse(charRule.validate(Single_Special_Char));
	}

	@Test
	public void test4() {
		assertFalse(charRule.validate(Special_Letters_Only));
	}

	@Test
	public void test5() {
		assertFalse(charRule.validate(Lower_Letters_Only));
	}

	@Test
	public void test6() {
		assertFalse(charRule.validate(Digits_Only));
	}

}
