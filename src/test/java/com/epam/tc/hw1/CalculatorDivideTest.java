package com.epam.tc.hw1;

import org.testng.annotations.Test;

public class CalculatorDivideTest extends CalculatorBaseTest {
    @Test(dataProviderClass = CalculatorTestData.class, dataProvider = "getTestDataForDivide")
    public void divideTest(double a, double b, double expected) {
        double actual = calculator.divide(a, b);
        CalculatorBaseTest.assertValueEquals("Calculation was wrong", actual, expected);
    }

    @Test(dataProviderClass = CalculatorTestData.class, dataProvider = "getTestDataForDivideByZero", expectedExceptions = {IllegalArgumentException.class})
    public void divideByZeroTest(int a, int b) {
        double actual = calculator.divide(a, b);
    }
}