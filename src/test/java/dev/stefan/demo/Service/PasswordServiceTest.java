package dev.stefan.demo.Service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import dev.stefan.demo.Config.SpringConfigTest;
import dev.stefan.demo.Valiation.CharRule;
import dev.stefan.demo.Valiation.LengthRule;
import dev.stefan.demo.Valiation.SequenceRule;
import dev.stefan.demo.Validation.CharRuleTest;
import dev.stefan.demo.Validation.LengthRuleTest;
import dev.stefan.demo.Validation.SequenceRuleTest;

public class PasswordServiceTest extends SpringConfigTest {

	@Autowired
	private PasswordService passwordService;

	@Test
	public void test1() {
		assertEquals(LengthRule.LENGTH_ERROR, passwordService.validate(LengthRuleTest.Null_String));
	}

	@Test
	public void test2() {
		assertEquals(LengthRule.LENGTH_ERROR, passwordService.validate(LengthRuleTest.Emplty_String));
	}

	@Test
	public void test3() {
		assertEquals(LengthRule.LENGTH_ERROR, passwordService.validate(LengthRuleTest.Length_Is_Four));
	}

	@Test
	public void test4() {
		assertNotEquals(LengthRule.LENGTH_ERROR, passwordService.validate(LengthRuleTest.Length_Is_Five));
	}

	@Test
	public void test5() {
		assertNotEquals(LengthRule.LENGTH_ERROR, passwordService.validate(LengthRuleTest.Length_Is_Six));
	}

	@Test
	public void test6() {
		assertNotEquals(LengthRule.LENGTH_ERROR, passwordService.validate(LengthRuleTest.Length_Is_Eleven));
	}

	@Test
	public void test7() {
		assertNotEquals(LengthRule.LENGTH_ERROR, passwordService.validate(LengthRuleTest.Length_Is_Twelve));
	}

	@Test
	public void test8() {
		assertEquals(LengthRule.LENGTH_ERROR, passwordService.validate(LengthRuleTest.Length_Is_Thirteen));
	}
	
	@Test
	public void test9() {
		assertEquals(CharRule.LETTER_DIGIT_ERROR, passwordService.validate(CharRuleTest.Digits_Only));
	}
	
	@Test
	public void test10() {
		assertEquals(CharRule.LETTER_DIGIT_ERROR, passwordService.validate(CharRuleTest.Lower_Letters_Only));
	}
	
	@Test
	public void test11() {
		assertEquals(CharRule.LETTER_DIGIT_ERROR, passwordService.validate(CharRuleTest.Single_Special_Char));
	}
	
	@Test
	public void test12() {
		assertEquals(CharRule.LETTER_DIGIT_ERROR, passwordService.validate(CharRuleTest.Single_Upper_Letter));
	}
	
	@Test
	public void test13() {
		assertEquals(CharRule.LETTER_DIGIT_ERROR, passwordService.validate(CharRuleTest.Special_Letters_Only));
	}
	
	@Test
	public void test14() {
		assertEquals(CharRule.LETTER_DIGIT_ERROR, passwordService.validate(CharRuleTest.Upper_Letters_Only));
	}
	
	@Test
	public void test15() {
		assertEquals(SequenceRule.SEQUENCE_REPEATED_ERROR, passwordService.validate(SequenceRuleTest.Digits_Repeated));
	}
	
	
	@Test
	public void test16() {
		assertEquals(SequenceRule.SEQUENCE_REPEATED_ERROR, passwordService.validate(SequenceRuleTest.Letters_Repeated));
	}
	
	@Test
	public void test17() {
		assertEquals(SequenceRule.SEQUENCE_REPEATED_ERROR, passwordService.validate(SequenceRuleTest.Single_Digit_Repeated));
	}
	
	@Test
	public void test18() {
		assertEquals(SequenceRule.SEQUENCE_REPEATED_ERROR, passwordService.validate(SequenceRuleTest.Single_Letter_Repeated));
	}
	
}
