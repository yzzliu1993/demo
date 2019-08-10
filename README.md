Programming problem demo
====

Instruction:
------

Write a password validation service, meant to be configurable via IoC (using dependency
injection engine of your choice). The service is meant to check a text string for compliance to
any number of password validation rules.

Rules
------

* Must consist of a mixture of lowercase letters and numerical digits only, with at least one of
each.
* Must be between 5 and 12 characters in length.
* Must not contain any sequence of characters immediately followed by the same sequence.

Getting Started
------
1. Open command line.
2. Go to demo.jar file directory
3. Type the following command: java -jar demo.jar password.

Test Class
------
CharRuleTest.class
```Java
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
```

LengthRuleTest.class
```Java
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
```

SequenceRuleTest.class
```Java
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
```

Running the test
------
All situations of all unit test 

1. Length Error:
type command below that will return **Length should be 5 or 12**

* `java -jar demo.jar 
* `java -jar demo.jar d`
* `java -jar demo.jar 123456789demo`

2. Upper Letter Error
type command below that will return **Password must not contain uppercase letters.**

* `java -jar demo.jar deMotest`
* `java -jar demo.jar deMo123`
* `java -jar demo.jar DEMOTEST`

3. Lower Letter and Digit Error
type command below that will return **Password consist of a mixture of lowercase letters and
numerical digits only, with at least one of each.**

* `java -jar demo.jar #$%$%`
* `java -jar demo.jar #demo123`
* `java -jar demo.jar demo$123`
* `java -jar demo.jar demo123&`
* `java -jar demo.jar demotest`
* `java -jar demo.jar 123456`

4. Sequence Error
type command below that will return **Password must not contain any sequence of characters immediately followed by the same sequence.**

* `java -jar demo.jar password1`
* `java -jar demo.jar demodemo1`
* `java -jar demo.jar word1123`
* `java -jar demo.jar word123123`

5. Password Correct
type command below that will return **Password is correct.**

* `java -jar demo.jar demotest123`
* `java -jar demo.jar 123demotest`

Built With
------
* JDK 1.8 
* Maven 
* Eclipse Oxygen 
* Spring-context 4.3.0.RELEASE 
* Spring-test 4.3.0.RELEASE
* Junit 4.12
