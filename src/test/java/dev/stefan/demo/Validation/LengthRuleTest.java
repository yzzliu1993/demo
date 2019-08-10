package dev.stefan.demo.Validation;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import dev.stefan.demo.Config.SpringConfigTest;
import dev.stefan.demo.Valiation.LengthRule;

public class LengthRuleTest extends SpringConfigTest{

	@Autowired
	private LengthRule lengthRule;
	
	public static final String Null_String = null;
	public static final String Emplty_String = "   ";
	public static final String Length_Is_Four = "12ab";
	public static final String Length_Is_Five = "123ab";
	public static final String Length_Is_Six = "123abc";
	public static final String Length_Is_Eleven = "123456789ab";
	public static final String Length_Is_Twelve = "123456789abc";
	public static final String Length_Is_Thirteen = "123456789abcd";
	
	
	@Test
	public void test1() {
		assertFalse(lengthRule.validate(Null_String));
	}

	@Test
	public void test2() {
		assertFalse(lengthRule.validate(Emplty_String));
	}
	
	@Test
	public void test3() {
		assertFalse(lengthRule.validate(Length_Is_Four));
	}
	
	@Test
	public void test4() {
		assertTrue(lengthRule.validate(Length_Is_Five));
	}
	
	@Test
	public void test5() {
		assertTrue(lengthRule.validate(Length_Is_Six));
	}
	
	@Test
	public void test6() {
		assertTrue(lengthRule.validate(Length_Is_Eleven));
	}
	
	@Test
	public void test7() {
		assertTrue(lengthRule.validate(Length_Is_Twelve));
	}
	
	@Test
	public void test8() {
		assertFalse(lengthRule.validate(Length_Is_Thirteen));
	}
	
}
