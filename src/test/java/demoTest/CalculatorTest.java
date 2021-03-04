package demoTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest extends Calculator {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		int a = 2;
		int b = 3;
		Calculator calc = new Calculator();
		int actual = calc.add(a, b);

		Assert.assertEquals("Addition fail", 5, actual);
	}

	@Test
	public void testSub() {
		int a = 4;
		int b = 3;
		Calculator calc = new Calculator();
		int actual = calc.sub(a, b);

		Assert.assertEquals("Substraction fail", 1, actual);
	}
}
