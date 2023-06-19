package com.epam.tc.hw1;

import org.testng.annotations.Test;

public class CalculatorSubTest extends CalculatorBaseTest {

    @Test(dataProviderClass = CalculatorTestData.class, dataProvider = "getTestDataForSub")
    public void subtractTest(int a, int b, int expected) {
        int actual = calculator.subtract(a, b);
        CalculatorBaseTest.assertValueEquals("Calculation was wrong", actual, expected);
    }

    @Test(dataProviderClass = CalculatorTestData.class, dataProvider = "getTestDataForSubOverflow", expectedExceptions = {ArithmeticException.class})
    public void subtractTestOverflow(int a, int b) throws ArithmeticException {
        int actual = calculator.subtract(a, b);
        if ((a < 0 && b > 0 && actual > 0) || (a > 0 && b < 0 && actual < 0)) {
            throw new ArithmeticException();
        }
    }
}