package fr.epsi.demottest2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

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

    @Test
    public void testMul() {
        int a = 4;
        int b = 2;
        Calculator calc = new Calculator();
        int actual = calc.mul(a, b);

        Assert.assertEquals("Mul fail", 8, actual);
    }

    @Test
    public void testDiv() {
        int a = 4;
        int b = 2;
        Calculator calc = new Calculator();
        int actual = calc.div(a, b);

        Assert.assertEquals("Div fail", 2, actual);
    }

    @Test
    public void testIsPair() {
        Calculator calc = new Calculator();

        boolean actual = calc.isPair(1);
        Assert.assertFalse(actual);

        actual = calc.isPair(2);
        Assert.assertTrue(actual);
    }

}
