package dev.stefan.demo.Validation;

import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import dev.stefan.demo.Config.SpringConfigTest;
import dev.stefan.demo.Valiation.SequenceRule;

public class SequenceRuleTest extends SpringConfigTest {

	@Autowired
	private SequenceRule sequenceRule;

	public static final String Single_Letter_Repeated = "password1";

	public static final String Letters_Repeated = "demodemo1";

	public static final String Single_Digit_Repeated = "word1123";

	public static final String Digits_Repeated = "word123123";

	@Test
	public void test1() {
		assertFalse(sequenceRule.validate(Single_Letter_Repeated));
	}

	@Test
	public void test2() {
		assertFalse(sequenceRule.validate(Letters_Repeated));
	}

	@Test
	public void test3() {
		assertFalse(sequenceRule.validate(Single_Digit_Repeated));
	}

	@Test
	public void test4() {
		assertFalse(sequenceRule.validate(Digits_Repeated));
	}

}
