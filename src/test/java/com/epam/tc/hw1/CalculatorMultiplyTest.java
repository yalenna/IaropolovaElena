package com.epam.tc.hw1;

import org.testng.annotations.Test;

public class CalculatorMultiplyTest extends CalculatorBaseTest {
    @Test(dataProviderClass = CalculatorTestData.class, dataProvider = "getTestDataForMultiply")
    public void multiplyTest(int a, int b, int expected) {
        int actual = calculator.multiply(a, b);
        CalculatorBaseTest.assertValueEquals("Calculation was wrong", actual, expected);
    }

    @Test(dataProviderClass = CalculatorTestData.class, dataProvider = "getTestDataForMultiplyOverflow", expectedExceptions = {ArithmeticException.class}, expectedExceptionsMessageRegExp = ".*integer overflow.*")
    public void multiplyOverflowTest(int a, int b) throws ArithmeticException {
        int actual = calculator.multiply(a, b);
        if (b != 0 && actual / b != a) {
            throw new ArithmeticException("integer overflow");
        }
    }
}