package com.epam.tc.hw1;

import org.testng.annotations.Test;

public class CalculatorSumTest extends CalculatorBaseTest {
    @Test(dataProviderClass = CalculatorTestData.class, dataProvider = "getTestDataForSum")
    public void sumTest(int a, int b, int expected) {
        int actual = calculator.sum(a, b);
        CalculatorBaseTest.assertValueEquals("Calculation was wrong", actual, expected);
    }

    @Test(dataProviderClass = CalculatorTestData.class, dataProvider = "getTestDataForSumOverflow", expectedExceptions = {ArithmeticException.class})
    public void sumOverflowTest(int a, int b) throws ArithmeticException {
        int actual = calculator.sum(a, b);
        if ((a > 0 && b > 0 && actual < 0) || (a < 0 && b < 0 && actual > 0)) {
            throw new ArithmeticException();
        }
    }
}