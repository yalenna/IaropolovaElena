package com.epam.tc.hw1;

import com.epam.tc.hw1.calculator.Calculator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public abstract class CalculatorBaseTest {
    protected Calculator calculator;
    public static void assertValueEquals(String message, Object actual, Object expected) {
        assertThat(actual)
                .as(message)
                .isEqualTo(expected);
    }

    @BeforeMethod
    public void setUp() {
        calculator = new Calculator();
    }

    @AfterMethod
    public void tearDown() {
        calculator = null;
    }
}